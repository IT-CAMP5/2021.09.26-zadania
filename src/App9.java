import java.util.Random;

public class App9 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        Random random = new Random();
        int[] sums = new int[tab.length];

        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(101);
                sums[i] = sums[i] + tab[i][j];
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        int max = -1;
        int maxIndex = 0;
        for(int i = 0; i < sums.length; i++) {
            if(max < sums[i]) {
                max = sums[i];
                maxIndex = i;
            }
        }

        double avg = ((double) max)/tab[maxIndex].length;
        System.out.println("Największa średnia: " + avg);
        System.out.println("Wiersz z największą średnią:");
        for(int element : tab[maxIndex]) {
            System.out.print(element + " ");
        }

    }
}

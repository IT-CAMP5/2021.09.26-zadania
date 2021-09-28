import java.util.Random;

public class App8 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        tab[0] = random.nextInt(101);
        for (int i = 1; i < tab.length; i++) {
            tab[i] = random.nextInt(101 - tab[i - 1]) + tab[i - 1];
        }

        for (int element : tab) {
            System.out.print(element + " ");
        }
    }
}

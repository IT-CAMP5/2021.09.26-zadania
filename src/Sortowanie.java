import java.util.Random;

public class Sortowanie {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        /******* GENEROWANIE TABLICY *****/
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        /******* SORTOWANIE ******/
        while(true) {
            boolean bylaZamiana = false;
            for(int i = 0; i < tab.length - 1; i++) {
                if(tab[i] > tab[i + 1]) {
                    int temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    bylaZamiana = true;
                }
            }
            if(!bylaZamiana) {
                break;
            }
        }

        for(int element : tab) {
            System.out.print(element + " ");
        }
    }
}

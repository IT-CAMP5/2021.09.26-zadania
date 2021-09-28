import java.util.Random;

public class App7 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        /******* generowanie tablicy ******/
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        /******* odwracanie tablicy *******/
        int[] result = new int[tab.length];
        for(int i = 0, j = tab.length - 1; i < tab.length; i++, j--) {
            result[j] = tab[i];
        }

        /****** wypisywanie odwróconej tablicy *****/
        for (int element : result) {
            System.out.print(element + " ");
        }
        System.out.println();

        /****** wyliczanie średniej ******/
        int sum = 0;
        for (int element : result) {
            sum = sum + element;
        }
        double avr = ((double) sum)/result.length;
        System.out.println(avr);
    }
}

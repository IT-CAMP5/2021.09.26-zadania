import java.util.Random;

public class App5 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        /******* uzupełnianie tablicy ********/
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
        }

        /********* wypisywanie tablicy ******/
        for(int element : tab) {
            System.out.print(element + " ");
        }

        int min = tab[0];
        int minIndex = 0;
        for(int i = 1; i < tab.length; i++) {
            if(min > tab[i]) {
                min = tab[i];
                minIndex = i;
            }
        }

        System.out.println();
        System.out.println("Najmniejsza liczba w tablicy " + min);
        System.out.println("Najmniejsza liczba znajduje się pod indexem " + minIndex);
    }
}

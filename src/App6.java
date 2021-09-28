import java.util.Random;

public class App6 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        //int[] tab = {98, 5, 85, 61, 94, 86, 18, 96, 89, 81};
        Random random = new Random();

        /******* uzupełnianie tablicy ********/
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
        }

        /********* wypisywanie tablicy ******/
        for(int element : tab) {
            System.out.print(element + " ");
        }

        int max = tab[0];
        int maxIndex = 0;
        boolean flag = false;
        for(int i = 1; i < tab.length; i++) {
            // szukam liczby parzystej większej od max
            // lub
            // szukam jakiejkolwiek liczby parzystej jeśli max jest nieparzysty
            if((max < tab[i] && tab[i]%2 == 0) || (max%2 != 0 && tab[i]%2 == 0)) {
                max = tab[i];
                maxIndex = i;
                flag = true;
            }
        }

        if(flag || max%2 == 0) {
            System.out.println();
            System.out.println("Największa liczba w tablicy " + max);
            System.out.println("Największa liczba znajduje się pod indexem " + maxIndex);
        } else {
            System.out.println();
            System.out.println("Tablica nie ma parzystych elementów");
        }
    }
}

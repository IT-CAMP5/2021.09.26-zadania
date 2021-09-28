import java.util.Random;

public class App4 {
    public static void main(String[] args) {
        int[] tab = new int[5];
        Random random = new Random();

        /******* uzupełnianie tablicy ********/
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101)-50;
        }

        /********* wypisywanie tablicy ******/
        for(int element : tab) {
            System.out.println(element);
        }
    }
}

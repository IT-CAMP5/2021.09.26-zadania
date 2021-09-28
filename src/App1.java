public class App1 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        /****** uzupełnianie tablicy *******/
        for(int i = 0; i < 10; i++) {
            tab[i] = i;
        }

        /******* wypisywanie tablicy ******/
        for(int element : tab) {
            System.out.print(element + " ");
        }
    }
}

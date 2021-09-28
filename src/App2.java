public class App2 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        /******* uzupełnianie danych ******/
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                tab[i][j] = j;
            }
        }

        /****** wypisywanie ******/
        /*for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }*/

        for(int[] row : tab) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

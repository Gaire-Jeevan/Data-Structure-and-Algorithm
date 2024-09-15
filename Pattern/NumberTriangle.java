public class NumberTriangle {
    public static void main(String[] args) {
        int row = 5;
        diamondNumberTriangle(row);
    }

    // number triangle

    /*     
             1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
    */
    static void numberTriangle(int n) {
        
        for(int row = 0; row < n; row++){
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    // diamond number triangle

    /*
                 1
               2 1 2
             3 2 1 2 3
           4 3 2 1 2 3 4
         5 4 3 2 1 2 3 4 5
           4 3 2 1 2 3 4
             3 2 1 2 3
               2 1 2
                 1
     */

    static void diamondNumberTriangle(int n) {
        
        for(int row = 0; row < 2 * n; row++){

            int c = row < n ? row : 2 * n - row;

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

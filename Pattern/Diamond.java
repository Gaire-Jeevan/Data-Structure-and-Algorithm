public class Diamond {
    public static void main(String[] args) {
        int col = 5;
        diamond(col);
    }

    // diamond patern

    /*
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
    */
    static void diamond(int n) {
        for (int i = 0; i < 2*n ; i++) {
            // n - (i - n + 1) = 2n - i -1
            int totalColumn = i < n ? i : 2 * n - i;

            int noOfSpaces = n - totalColumn;


            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalColumn; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

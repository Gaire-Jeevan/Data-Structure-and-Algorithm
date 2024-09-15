public class Rectangle {

   
    public static void main(String[] args) {
        int row = 4;
        numberRectangle(row);
    }

    // simple rectangle

     /*
        * * * * 
        * * * *
        * * * *
        * * * *
    */
    static void simpleRectangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // number rectangle

    /*
        4 4 4 4 4 4 4 4 4 
        4 3 3 3 3 3 3 3 4
        4 3 2 2 2 2 2 3 4
        4 3 2 1 1 1 2 3 4
        4 3 2 1 0 1 2 3 4
        4 3 2 1 1 1 2 3 4
        4 3 2 2 2 2 2 3 4
        4 3 3 3 3 3 3 3 4
        4 4 4 4 4 4 4 4 4
    */

    static void numberRectangle(int n) {
        int N = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = N - (Math.min(Math.min(row, col), Math.min(n - row, n - col)));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
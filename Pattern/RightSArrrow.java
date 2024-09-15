public class RightSArrrow {
    public static void main(String[] args) {
        int row = 5;
        rightArrow(row);
    }

    // right arrow
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

    static void rightArrow(int n) {
        for (int i = 0; i < 2*n ; i++) {
            // n - (i - n + 1) = 2n - i -1
            int totalColumn = i < n ? i : 2 * n - i;

                for (int j = 0; j < totalColumn; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


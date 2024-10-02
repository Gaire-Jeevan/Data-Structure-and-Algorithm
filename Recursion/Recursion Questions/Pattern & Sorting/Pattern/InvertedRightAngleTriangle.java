public class InvertedRightAngleTriangle {
    public static void main(String[] args) {
        System.out.println("Normal triangle:- ");
        normalTriangle(4, 0);

        System.out.println("\n\nInverted Triangle:- ");
        invertedTriangle(4, 0);
    }

    // normal triangle
    static void normalTriangle(int r, int c) {
        if(r == 0) {
            return;
        }

        // row start with row number i.e. if there are 5 row then row start from 5 itself and reduced to 1
        if (c < r) {
            // column increase till column reaches to row
            normalTriangle(r, c + 1);
            System.out.print("* ");
        }
        else{
            normalTriangle(r - 1, 0);
            System.out.println();
        }
    }

    // inverted triangle
    static void invertedTriangle(int r, int c) {
        if(r == 0) {
            return;
        }

        // row start with row number i.e. if there are 5 row then row start from 5 itself and reduced to 1
        if (c < r) {
            System.out.print("* ");
            // column increase till column reaches to row
            invertedTriangle(r, c + 1);
        }
        else{
            System.out.println();
            invertedTriangle(r - 1, 0);
        }
    }
}
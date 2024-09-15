public class RightAngleTriangle {
   
    public static void main(String[] args) {
        numberTriangle(5);
    }


     // Right angle triangle
    /*
        * 
        * *
        * * *
        * * * *
    */

    static void starTriangle(int n) {
        int row = 4;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Number right angle triangle
    /*
        1 
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
    */
    
    static void numberTriangle(int n) {
        

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print((j+1) + " ");
                
            }
            System.out.println();
        }
    }
}

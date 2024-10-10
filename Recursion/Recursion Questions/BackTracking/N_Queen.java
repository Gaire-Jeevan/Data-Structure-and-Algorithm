public class N_Queen {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println("The total ways we can put queens in maze are:- " + (queens(board, 0)));
    }

    // as every time column is starting from 0 so no need to pass column in function argument
    static int queens(boolean[][] board, int row) {
        // when row no is outside the range of board array i.e. board.length
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;

                // after placing queen check for below row if it can place queen
                count += queens(board, row + 1);

                // while coming out of function call revert the changes
                board[row][col] = false;
            }
        }

        return count;
    }

    // checking if any queens is present in current row or column
    private static boolean isSafe(boolean[][] board, int row, int col) {

        // check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);

        // subtracting 1 till we have to go so start from 0 because the index of matrix is start from 0 so let's say when row = 3 and col = 2 so maxLeft = 2 and we have to go 2 left so if we start from 0 then [row - i] is itself [row] so we cannot check it diagonally
        for (int i = 1; i <= maxLeft; i++) {

            // when we are going left row and column both decreasing as it is heading towards topLeft
            // if diagonal element is true then return false
            if (board[row - i][col - i]) {
                return false;
            }
        }


        // DIAGONAL RIGHT

        int maxRight = Math.min(row, board.length - col - 1);

        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

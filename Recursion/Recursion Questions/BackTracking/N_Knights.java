public class N_Knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        knight(board, 0, 0, n);
    }

    static void knight(boolean[][] board, int row, int col, int knights) {
        if(knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        // if the current pointer goes out of bound in last row then simply skip it
        if (row == board.length - 1 && col == board.length) {
            return;
        }

 // if the current pointer goes out of bounds for rows
 if (row == board.length) {
    return;
}


        // one row (traversing in all column finished) and still some knight are not placed go to next row
        if (col == board.length) {
            // in new row column should be start from no i.e. 0
            knight(board, row + 1, 0, knights);
            return;
        }

        // if it is safe to place knight then place it 
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            // decrease knight number after placing it
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        // not safe then simply move ahead
        knight(board, row, col + 1, knights);
    }

    // check if it is safe to put knight here in this col or not
    private static boolean isSafe(boolean[][] board, int row, int col) {

        // when it is valid to put knight in column
        if (isValid(board, row, col)) {
            // if knight is already available in that position or not
            if (board[row][col]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        return true;
    }


    // Do Not Repeat Yourself hence created
    // this function is used to return the condition of the current pointer
    static boolean isValid(boolean[][] board, int row, int col) {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }


    // display board
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

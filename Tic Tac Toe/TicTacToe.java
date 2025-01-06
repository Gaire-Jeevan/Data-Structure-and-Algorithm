import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.print("Player " + player + " enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board[row][col] == ' ') {
                // place the element
                board[row][col] = player;
                gameOver = haveWon(board, player);

                if (gameOver) {
                    System.out.println("Hurray, " + player + " won");
                    gameOver = true;
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }

            } else {
                System.out.println("Invalid move. Try again!");
            }

        }
        printBoard(board);
    }
            
               
            
    public static boolean haveWon(char[][] board, char player) {
        // check the column
        for (int row = 0; row < board[0].length; row++) {
            if (board[row][0] == player && board[row][1] == player  && board[row][2] == player) {
                
                return true;
            }
        }

        // check for row
        for (int row = 0; row < board.length; row++) {
            if (board[0][row] == player && board[1][row] == player  && board[2][row] == player) {
                
                return true;
            }
        }

        // diagonal
        if ((board[0][0] == player && board[1][1] == player  && board[2][2] == player) || (board[0][2] == player && board[1][1] == player  && board[2][0] == player)) {
            
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (col == board.length - 1) {
                    System.out.print(board[row][col] + " ");
                }
                else {
                    System.out.print(board[row][col] + " | ");
                }
            }
            System.out.println();
        }
    }
}
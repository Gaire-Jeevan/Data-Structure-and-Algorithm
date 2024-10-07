import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        // maze with obstacles
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };

        System.out.print("All path to reach target is:- ");
        allPath("", board, 0, 0);


        int[][] path = new int[board.length][board[0].length];

        // all path print (print in matrix form)
        allPathPrintMatrix("", board, 0, 0, path, 1);
    }

    // including all Path right, left, up and down
    // the row and col are starting from 0
    static void allPath(String p, boolean maze[][], int row, int col) {
        // we are passing 2D boolean array 
        if (row == maze.length - 1 && col ==  maze[0].length - 1) {
            System.out.print(p + ", ");
            return;
        }

        // checking if the current position is at obstacles
        if(!maze[row][col]) {
            return;
        }

        // I am considering this block in my path
        maze[row][col] = false;

        // Down
        if (row < maze.length - 1) {
            allPath(p + 'D', maze, row + 1, col);
        }

        // Right
        if (col < maze[0].length - 1) {
            allPath(p + 'R', maze, row, col + 1);
        }

        // Up
        if (row > 0) {
            allPath(p + 'U', maze, row - 1, col);
        }

        // Left
        if (col > 0) {
            allPath(p + 'L', maze, row, col - 1);
        }

        // before return make it true
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by this function
        maze[row][col] = true;        
    }


    // printMatrix
    static void allPathPrintMatrix(String p, boolean maze[][], int row, int col, int[][] path, int step) {
        // we are passing 2D boolean array 
        if (row == maze.length - 1 && col ==  maze[0].length - 1) {
            
            // last step is also a step
            path[row][col] = step;
            
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            // new line
            System.out.println();
            return;
        }

        // checking if the current position is at obstacles
        if(!maze[row][col]) {
            return;
        }

        // I am considering this block in my path
        maze[row][col] = false;

        // add answer in path
        path[row][col] = step;

        // Down
        if (row < maze.length - 1) {
            allPathPrintMatrix(p + 'D', maze, row + 1, col, path, step + 1);
        }

        // Right
        if (col < maze[0].length - 1) {
            allPathPrintMatrix(p + 'R', maze, row, col + 1, path, step + 1);
        }

        // Up
        if (row > 0) {
            allPathPrintMatrix(p + 'U', maze, row - 1, col, path, step + 1);
        }

        // Left
        if (col > 0) {
            allPathPrintMatrix(p + 'L', maze, row, col - 1, path, step + 1);
        }

        // before return make it true
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by this function
        maze[row][col] = true;  
        
        // backtrack
        path[row][col] = 0;
    }
}

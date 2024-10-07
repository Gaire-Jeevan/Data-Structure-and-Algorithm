import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println("The total no path to reach target is:- " + pathCount(3, 3));

        System.out.print("The different path to the target are:- ");
        path("", 3, 3);
        
        System.out.println("\nThe different path to the target are (with ArrayList return method):- " + pathReturn("", 3, 3));
        
        System.out.println("\nThe different path (include diagonal path too) to the target are (with ArrayList return method):- " + pathReturnDiagonal("", 3, 3));

        // maze with obstacles
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };

        System.out.print("\nPath to reach target with restriction in between:- ");
        pathRestriction("", board, 0, 0);

    }

    static int pathCount(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        // we are starting from last column and decreasing row number when we go down and decreasing col no when we go right
        int down = pathCount(row - 1, col);
        int right = pathCount(row, col - 1);

        return down + right;
    }


    // PRINTING PATH
    static void path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.print(p + ", ");
            return;
        }

        if (row > 1) {
            path(p + 'D', row - 1, col);
        }

        if (col > 1) {
            path(p + 'R', row, col - 1);
        }
    }


    // Printing path by returning arrayList
    static ArrayList<String> pathReturn(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(pathReturn(p + 'D', row - 1, col));
        }

        if (col > 1) {
            list.addAll(pathReturn(p + 'R', row, col - 1));
        }

        return list;
    }


    // Printing path (also including going diagonally) by returning arrayList
    static ArrayList<String> pathReturnDiagonal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(pathReturnDiagonal(p + 'V', row - 1, col));
        }

        // going diagonally
        if(row > 1 && col > 1){
            list.addAll(pathReturnDiagonal(p + 'H', row - 1, col - 1));
        }

        if (col > 1) {
            list.addAll(pathReturnDiagonal(p + 'H', row, col - 1));
        }

        return list;
    }


    // path with restriction
    // PRINTING PATH
    // here row and col determine the current position
    static void pathRestriction(String p, boolean maze[][], int row, int col) {
        // we are passing 2D boolean array 
        if (row == maze.length - 1 && col ==  maze[0].length - 1) {
            System.out.print(p + ", ");
            return;
        }

        // checking if the current position is at obstacles
        if(!maze[row][col]) {
            return;
        }

        if (row < maze.length - 1) {
            pathRestriction(p + 'D', maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            pathRestriction(p + 'R', maze, row, col + 1);
        }
    }

    
}
import java.util.Arrays;

public class SearchIn2D_Array {
    
    public static void main(String[] args) {
        int[][] arr = {
            {2, 5 , 85},
            {65, 96, 52, 32},
            {52, 2, 32}
        };
    
        int target = 32;
        int[] ans = search(arr, target);
    
        System.out.println(Arrays.toString(ans));
        
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }

        return new int[] {-1, -1};
    }
}

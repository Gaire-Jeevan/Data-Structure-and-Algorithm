import java.util.Arrays;

public class SquareRootDecomposition_Mos_Algorithm {
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 6, 3, 1, 4, 8};
        int n = arr.length;

        // buid a blocks array
        int sqrt = (int) Math.sqrt(n);

        // it is first taken as -1 so that when loop run it increase to 1
        int block_id = -1;

        int[] block = new int[sqrt + 1];

        for (int i = 0; i < n; i++) {
            // new block is starting
            if (i % sqrt == 0) {
                block_id++;
            }

            block[block_id] += arr[i];
        }

        System.out.println(Arrays.toString(block));
        System.out.println("The sum in range 2 and 7 is " + query(block, arr, 2, 7, sqrt));
    }

    // this is for sum in range
    public static int query(int[] block, int[] arr, int left, int right, int sqrt) {
        int ans = 0;

        // left part
        while (left % sqrt != 0) {
            ans += arr[left];
            left++;
        }

        // middle part
        // left == 0 so that it is on starting of block and right is after that block
        while (left + sqrt <= right) {
            ans += block[left / sqrt];
            left += sqrt;
        }

        // right part
        while (left <= right) {
            ans += arr[left];
            left++;
        }

        return ans;
    }

    public void update(int[] block, int[] arr, int index, int val, int sqrt) {
        int block_id = index / sqrt;
        block[block_id] += (val - arr[index]);

        arr[index] = val;
    }
}
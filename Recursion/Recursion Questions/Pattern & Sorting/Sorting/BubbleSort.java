import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int r, int c ) {
        if(r == 0) {
            return;
        }

        // row start with row number i.e. if there are 5 row then row start from 5 itself and reduced to 1
        if (c < r) {

            if(arr[c] > arr[c + 1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            // column increase till column reaches to row
            bubbleSort(arr, r, c + 1);
        }
        else{
            bubbleSort(arr, r - 1, 0);
        }
    }
}
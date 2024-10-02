import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int row, int col, int max ) {
        if(row == 0) {
            return;
        }

        // row start with row number i.e. if there are 5 row then row start from 5 itself and reduced to 1
        if (col < row) {

            if(arr[col] > arr[max]) {
                // update maximum
                selectionSort(arr, row, col + 1, col);
            }
            else {
                // column increase till column reaches to row
                selectionSort(arr, row, col + 1, max);
            }  
        }
        else{
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] =  temp;

            selectionSort(arr, row - 1, 0, 0);
        }
    }
}

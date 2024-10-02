import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int middle = (start + end) / 2;
        int pivot = nums[middle];

        // whenever LHS element is smaller than pivot--> all good , move forward
        while (start <= end) {

            // also a reason why if its already sorted it will not swap
            while (nums[start] < pivot) {
                start++;
            }

            // whenever RHS element is larger than pivot--> all good , move backward
            while (nums[end] > pivot) {
                end--;
            }

            // swap is done only if start go beyond end
            if(start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        // after condition violate end comes closer to start and start move to end of array
        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }
}
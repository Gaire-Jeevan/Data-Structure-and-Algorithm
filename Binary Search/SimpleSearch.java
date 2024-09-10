public class SimpleSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 15, 18, 19, 25, 45, 46, 59, 89};
        int target = 45;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element

            // int mid = (start + end) / 2; // for very large element the sum of start and end will be very large which may be out of the int range so,
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
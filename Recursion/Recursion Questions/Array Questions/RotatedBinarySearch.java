public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 9, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int middle = (start + end) / 2;
        if (arr[middle] == target) {
            return middle;
        }

        // check if element is in left hand side of middle element
        if (arr[start] <= arr[middle]) {
            if (target >= arr[start] && target <= arr[middle]) {
                return search(arr, target, start, middle - 1);
            }
            else {
                return search(arr, target, middle + 1, end);
            }
        }

        // check if element is in right hand side of middle element
        if (target >= arr[middle] && target <= arr[end]) {
            return search(arr, target, middle + 1 , end);
        }

        // if middle element is smaller than both start and end element
        return search(arr, target, start, middle - 1);
    }
}

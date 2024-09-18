public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 66, 78};
        System.out.println(binarySearchUsingRecursion(arr, 78, 0, arr.length - 1));
    }

    static int binarySearchUsingRecursion(int[] arr, int target, int start, int end) {
        
        if (start > end) {
            return -1;
        }

        int middle = (start + end) / 2;

        if(arr[middle] == target) {
            return middle;
        }

        if (target < arr[middle]){
            return binarySearchUsingRecursion(arr, target, start, middle - 1);
        }
        else{
            return binarySearchUsingRecursion(arr, target, middle - 1, end);
        }
    }
}

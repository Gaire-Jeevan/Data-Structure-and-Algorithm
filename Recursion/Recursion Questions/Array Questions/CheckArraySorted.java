public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {2, 5, 60, 8, 9};
        System.out.println(checkArraySorted(arr, 0));
    }

    static boolean checkArraySorted(int[] arr, int index) {
        // base condition is when we are at last index
        if( index == arr.length - 1) {
            return true;
        }

        // here there arr doesn't go index out of bound as it is returning when index is at last element
        return arr[index] < arr[index + 1] && checkArraySorted(arr, index + 1);
    }
}
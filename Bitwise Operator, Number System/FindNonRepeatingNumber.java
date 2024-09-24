public class FindNonRepeatingNumber {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(findNonRepeatingNumber(arr));
    }

    static int findNonRepeatingNumber(int[] arr) {
        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            number = number ^ arr[i];
        }

        return number;
    }
}

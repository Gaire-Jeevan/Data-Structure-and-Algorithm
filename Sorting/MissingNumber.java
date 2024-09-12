public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 4, 2, 1, 3};
        int ans = missingNumber(arr);
        System.out.println(ans); 
    }
    
    // code of cyclic sort
    public static int missingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            // the correct index of element is i as the element are continious from 0 to N
            int correct = arr[i];
            // check if current element is at right index
            // element should be less than the N i.e array.length 
            if ((arr[i] < arr.length) && (arr[i]  != arr[correct]) ) {
                swap(arr, i, correct);
            }
            else {
                i++;
            } 
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index]) {
                return index;
            }
        }

        // CASE II
        // if all element are present at right index then probably the missing value will be arr.length i.e. in 5 element array answer will be 5
        // [4, 0, 3, 1, 2]  => answer = 5
        return arr.length;
        
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

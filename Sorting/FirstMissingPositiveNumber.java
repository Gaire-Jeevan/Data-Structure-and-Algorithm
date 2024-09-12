public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            // the correct index of element is i as the element are continious from 0 to N
            int correct = nums[i] - 1;
            // check if current element is at right index
            // element should be less than the N i.e array.length 
            // if number is positive then only check, ignore negative one
            if (nums[i] > 0 && (nums[i] <= nums.length) && (nums[i]  != nums[correct]) ) {
                swap(nums, i, correct);
            }
            else {
                i++;
            } 
        }

        // search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (index + 1 != nums[index]) {
                return index + 1;
            }
        }

        // CASE II
        // if all element are present at right index then probably the missing value will be arr.length i.e. in 5 element array answer will be 5
        // [4, 0, 3, 1, 2]  => answer = 5
        return nums.length + 1;
        
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

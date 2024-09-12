import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 2, 6, 5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            // the correct index of element is i as the element are continious from 0 to N
            int correct = nums[i] - 1;
            // check if current element is at right index
            // element should be less than the N i.e nums.length 
            if ((nums[i]  != nums[correct]) ) {
                swap(nums, i, correct);
            }
            else {
                i++;
            } 
        }

        // search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index + 1} ;
            }
        }

        // if all element are at right index
        return new int[] {-1, -1};
        
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

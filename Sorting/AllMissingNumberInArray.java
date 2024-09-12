import  java.util.ArrayList;
import  java.util.List;

public class AllMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            // the correct index of element is i - 1 as the element are continious from 1 to N
            int correct = nums[i] - 1;
            // check if current element is at right index
            if (nums[i]  != nums[correct] ) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        // find missing numbers
        List <Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

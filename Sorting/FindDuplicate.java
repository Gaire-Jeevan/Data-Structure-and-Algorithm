public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
     
    public static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {

            if (nums[i] != i + 1) {
                // the correct index of element is i - 1 as the element are continious from 1 to N
                int correct = nums[i] - 1;
                // check if current element is at right index
                if (nums[i]  != nums[correct] ) {
                    swap(nums, i, correct);
                }
                else {
                    return nums[i];
                }
            }
            else {
                i++;
            } 
        }
        return -1;
    }
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


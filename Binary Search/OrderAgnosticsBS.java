public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 15, 18, 19, 25, 45, 46, 59, 89};
        int target = 45;
        int ans = orderAgnosticsBS(arr, target);
        System.out.println(ans);

        int[] arr1 = {78, 65, 58, 49, 15, 6, 2, 1, -22};
        int target1 = 15;
        int ans1 = orderAgnosticsBS(arr1, target1);
        System.out.println(ans1);
    }

    static int orderAgnosticsBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascendingg or descending 
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
        
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // check for ascending and descending
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
    
}

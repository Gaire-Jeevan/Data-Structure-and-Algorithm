public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {42, 25, 69, 85, 12, 8};
    int target = 8;

    int ans = SearchInrange(arr, 1, 4, target);

    System.out.println("Target element " + " is found at:- " + ans + " " );
    }


    static int SearchInrange(int[] arr,  int start, int end, int target) {
        if(arr.length == 0) {
            return -1;
        }
    
        // run a for loop
        for(int index = start; index <= end; index++) {    
            int element = arr[index];
            if(element == target){
                return index;
            }
    
        }
        return -1;
    }
}

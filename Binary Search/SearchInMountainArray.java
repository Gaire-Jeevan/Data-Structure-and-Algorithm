public class SearchInMountainArray {
    public static void main(String[] args) {
        
    }

    public static int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticsBS(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticsBS(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // your are in decreasing part of array
                // this may be the answer, but look at left

                // this is why end != mid - 1;
                end = mid;

            } else {
                // you are in ascending part of array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
            
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always truing to find max element int he above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer
        return start; // or return end as both will be equal pointing to same element
    }

    static int orderAgnosticsBS(int[] arr, int target, int start, int end) {
        
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

public class NumberExist {

    
public static void main(String[] args) {
    int[] arr = {42, 25, 69, 85, 12, 8};
    int target = 8;

    int ans = linearSearch(arr, target);
    int element = searchElement(arr, target);

    System.out.println("Target element " + element + " is found at:- " + ans + " " );
}
    
// search in the array: return the index if item found
// otherwise if item not found return -1
static int linearSearch(int[] arr, int target) {
    if(arr.length == 0) {
        return -1;
    }

    // run a for loop
    for(int index = 0; index< arr.length; index++) {
        // check for element at every index if it is = target

        int element = arr[index];
        if(element == target){
            return index;
        }

    }

    // this line will execute if none of the return statements above have executed
    // hence element not found
    return -1;
}

static int searchElement(int[] arr, int target) {
    if(arr.length == 0) {
        return -1;
    }
    for(int element: arr) {
        
        if(element == target){
            return element;
        }

    }

    return -1;


}
}
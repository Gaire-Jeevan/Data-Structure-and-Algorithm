import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 12, 56, 85, 56, 20};
        System.out.println(linearSearch(arr, 56, 0));

        System.out.println(linearSearch2(arr, 56, 0));

        findAllIndex(arr, 56, 0);
        System.out.println(list);

        System.out.println("Passing list in argument of a function");

        System.out.println(findAllIndex2(arr, 56, 0, new ArrayList<>()));

        System.out.println("Not passing list in argument of a function");
        System.out.println(findAllIndex3(arr, 56, 0));
    }

    static boolean linearSearch(int[] arr, int target, int index) {

        // if you are out of index bound return false
        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    // Method - II
    static int linearSearch2(int[] arr, int target, int index) {

        // if you are out of index bound return false
        if(index == arr.length) {
            return -1;
        }

        if (arr[index] == target ){
            return index;
        }
        return linearSearch2(arr, target, index + 1);
    }

    // Method - III
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    // Method - III
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list1) {

        if (index == arr.length) {
            return list1;
        }

        if(arr[index] == target) {
            list1.add(index);
        }

        // here we are using same name of list as original function has. it has same name but different refrence variable pointing to same object
        return findAllIndex2(arr, target, index + 1, list1);
    }


    // Method - IV
    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {

        ArrayList<Integer> list1 = new ArrayList<>();

        if (index == arr.length) {
            return list1;
        }

        // this will contain answer for that function call only
        if(arr[index] == target) {
            list1.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls =  findAllIndex3(arr, target, index + 1);

        // add all answer that we have got till now
        list1.addAll(ansFromBelowCalls);

        return list1;
    }
}

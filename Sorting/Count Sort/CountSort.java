import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {

    public static void countSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        // frequency array
        int[] countArray = new int[max + 1];

        for (int num : array) {
            countArray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                array[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }


    // countsort using hashmap
    public static void countSortHash(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);

            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    
    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 9, 2, 10, 4, 2, 9, 7};
        System.out.println(Arrays.toString(arr));
        
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }
}
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {

        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        // mid is exclusive
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0; // this pointer points the current position at new Array i.e. mix

        // when both pointers of first and second array are inside the bound
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Copying the remaining list

        // if second array iterated completely but not first
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // when first array iterated completely but not second
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }


    // MergeSort Inplace
    static void mergeSortInPlace(int[] arr, int start, int end) {

        if(end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, arr.length);

        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int middle, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = middle;
        int k = 0; 

        
        while (i < middle && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

       
        while (i < middle) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // copying in original array
        for (int l = 0; l<mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
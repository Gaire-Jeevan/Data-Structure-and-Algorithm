import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;

    // this is not the size of array but it is the total data that is inserted
    private int size = 0; // also working as index value

    // constructor
    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }

        // item is inserted first then only size increases
        data[size++] = num;
    }

    // function to resize array
    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current itesms in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        // previously data is pointing to old array now data is pointing to temp array
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }


    // remove element from ArrayList
    public int remove() {
        // not deleting element, reduce the size of array by 1.
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomArrayList { " + "data = " + Arrays.toString(data) + ", size = " + size + "}";
    }


    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();

        CustomArrayList list = new CustomArrayList();
        list.add(45);
        list.add(5);
        list.add(55);
        list.add(0);
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list.size());
    }
}
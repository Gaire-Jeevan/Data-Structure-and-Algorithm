import java.util.Arrays;

// as the previous ArrayList contain the array of integer only so here we are using such technique called Generic by which we can create the arraylist of any types.
public class CustomGenericArrayList<T> {

    // while using other generic like '''T[]''' we are getting a lot of error for different reason so solve this we use '''Object''' as it is base class for all the Class in java
    private Object[] data;
    private static int DEFAULT_SIZE = 10;

    // this is not the size of array but it is the total data that is inserted
    private int size = 0; // also working as index value

    // constructor
    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }

        // item is inserted first then only size increases
        data[size++] = num;
    }

    // function to resize array
    private void resize() {
        Object[] temp = new Object[data.length * 2];

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
    public T remove() {
        // not deleting element, reduce the size of array by 1.
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomArrayList { " + "data = " + Arrays.toString(data) + ", size = " + size + "}";
    }


    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(45);
        list.add(5);
        list.add(55);
        list.add(0);
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list.size());

        System.out.println();
        CustomGenericArrayList<String> list1 = new CustomGenericArrayList<>();
        list1.add("Ram");
        list1.add("Shyam");
        list1.add("Hari");
        list1.add("Bishnu");

        System.out.println("The last item removed from arraylist list1 is" + list1.remove());
        System.out.println("The size of arraylist " + list1.size());
        System.out.println(list1);
    }
}
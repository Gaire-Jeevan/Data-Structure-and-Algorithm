import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList();

        list.add(32);
        list.add(30);
        list.add(31);
        list.add(29);

        System.out.println(list);
    }
}
import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Jeevan", 89);
        map.put("Bibek", 99);
        map.put("Samir", 80);


        System.out.println(map.containsKey("Bibek"));

        HashSet<Integer> set = new HashSet<>();

        set.add(56);
        set.add(5);
        set.add(6);
        set.add(45);
        set.add(58);
        set.add(59);
        set.add(56);

        System.out.println(set);
    }

    
}
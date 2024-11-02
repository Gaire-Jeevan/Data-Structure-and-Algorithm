import java.util.Arrays;

public class Main {

    // something inside this function throws exception
    public static void main(String[] args) throws CloneNotSupportedException {
        Human jeevan = new Human(22, "Jeevan Gaire");
        // Human twin = new Human(jeevan);

        Human twin = (Human)jeevan.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        
        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println("original array:- " + Arrays.toString(jeevan.arr));
    }
    
}

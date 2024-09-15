import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Jeevan Gaire";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('e'));

        System.out.println("   Jeevan    ".strip());

        System.out.println(Arrays.toString(name.split(" ")));
    }
}

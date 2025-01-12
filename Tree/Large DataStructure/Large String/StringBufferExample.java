import java.text.DecimalFormat;
import java.util.Arrays;

public class StringBufferExample {
    public static void main(String[] args) {
        // constructor 1
        StringBuffer sb1 = new StringBuffer();

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Jeevan Gaire");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);


        System.out.println(sb1.capacity());
        System.out.println(sb3.capacity());

        sb1.append("Cricket is life");
        sb1.append("What a game, it has been");

        sb1.insert(2, "match");

        String str = sb1.toString();

        sb1.replace(2, 7, "");

        sb1.delete(0, 8);

        sb1.reverse();

        str = sb1.toString();

        System.out.println(str);


        int n = 20;
        String name = RandomString.generate(n);

        System.out.println(name);

        String random = "pne umon   ia";
        System.out.println(random);

        System.out.println(random.replaceAll("\\s", ""));

        // splitting string
        String arr = "Jeevan Bibek Ram Hari";
        String[] names = arr.split("\s");
        System.out.println(Arrays.toString(names));

        // rounding
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println(df.format(7.235));
    }
}
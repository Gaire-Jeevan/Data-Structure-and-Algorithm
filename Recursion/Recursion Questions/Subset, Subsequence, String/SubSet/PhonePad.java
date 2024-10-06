import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.print("The answer of function which direclty print:- ");
        phonePad("", "12");

        System.out.println("\n\nThe answer of function which return arrayList:- " + phonePad2("", "12"));

        System.out.println("The total no of recursion call made to find all pattern is " + padCount("", "12"));
    }

    static void phonePad(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        // this will convert '2' into 2
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3 ; i < (digit *3); i++) {
            char ch = (char) ('a' + i);
            phonePad(p + ch, up.substring(1));
        }
    }


    // returning arraylist
    static ArrayList<String> phonePad2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // this will convert '2' into 2
        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3 ; i < (digit *3); i++) {
            char ch = (char) ('a' + i);
            list.addAll(phonePad2(p + ch, up.substring(1)));
        }
        return list;
    }

    // returning the total no of recursion
    static int padCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = up.charAt(0) - '0';

        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}

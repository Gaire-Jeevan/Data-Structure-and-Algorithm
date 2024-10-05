import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
        // subSequences("", "abc");

        ArrayList<String> list = subSequence( "", "abc");
        System.out.println(list);

    }

    // p is processes and un is unprocessed string
    static void subSequences(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        // accepting the 1st character
        subSequences(p, up.substring(1));
        // rejecting the 1st character
        subSequences(p + ch, up.substring(1));
    }



    static ArrayList<String> subSequence(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();

            // adding in local arraylist
            list.add(p);

            // returning local answer when un-processed string become empty. which will store in left or right ArrayList
            return list;
        }

        char ch = up.charAt(0);

        // accepting the 1st character
        ArrayList<String> left = subSequence(p, up.substring(1));

        // rejecting the 1st character
        ArrayList<String> right = subSequence(p + ch, up.substring(1));
        

        left.addAll(right);
        return left;
    }
}
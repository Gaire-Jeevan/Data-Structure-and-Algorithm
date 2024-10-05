import java.util.ArrayList;

public class SubSequenceAscii {
    public static void main(String[] args) {
        subSequenceAscii("", "abc");


System.out.println("\n\nSubstring with Ascii value returned:- ");
        System.out.println(subSequenceAsciiReturn("", "abc"));
    }

     // p is processes and un is unprocessed string
     static void subSequenceAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        // rejecting the 1st character
        subSequenceAscii(p + ch, up.substring(1));

        // accepting the 1st character
        subSequenceAscii(p, up.substring(1));
        
        subSequenceAscii(p + (ch + 0), up.substring(1));
    }


    // storing answer in arraylist
     static ArrayList<String> subSequenceAsciiReturn(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();

            // adding in local arraylist
            list.add(p);

            // returning local answer when un-processed string become empty. which will store in left or right ArrayList
            return list;
        }

        char ch = up.charAt(0);

        // rejecting the 1st character
        ArrayList<String> first = subSequenceAsciiReturn(p + ch, up.substring(1));

        // accepting the 1st character
        ArrayList<String> second = subSequenceAsciiReturn(p, up.substring(1));
        
        ArrayList<String> third = subSequenceAsciiReturn(p + (ch + 0), up.substring(1));
        

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

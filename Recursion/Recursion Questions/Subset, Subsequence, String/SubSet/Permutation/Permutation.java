import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");

        System.out.println("\nPermutation of string (returned ArrayList)");
        ArrayList<String> ans = permutationList("", "abc");
        System.out.println(ans);

        // count permutation
        System.out.print("\nPermutation:- " + countPermutation("", "abcd"));
    }

    static void permutation(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p + " ");
            return;
        }

        char ch = up.charAt(0);

        // because the recursion call is done 1 more than the size of procssed string
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            // up.substring(1) -> because now one character is skipped from unprocessed string
            permutation(first + ch + second, up.substring(1));
        }
    }


    // returning arraylist
    static ArrayList<String> permutationList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();

            // adding in local arraylist
            list.add(p);

            // returning local answer when un-processed string become empty. which will store in left or right ArrayList
            return list;
        }

        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        // because the recursion call is done 1 more than the size of procssed string
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            // up.substring(1) -> because now one character is skipped from unprocessed string

            // addAll--> add the answer that we get from the recursion call
            ans.addAll(permutationList(first + ch + second, up.substring(1)));
        }

        return ans;
    }


    // count total no of recursion calls -finding permutation
    static int countPermutation(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        int count = 0;

        char ch = up.charAt(0);

        // because the recursion call is done 1 more than the size of procssed string
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            // up.substring(1) -> because now one character is skipped from unprocessed string
            count = count + countPermutation(first + ch + second, up.substring(1));
        }

        return count;
    }
}
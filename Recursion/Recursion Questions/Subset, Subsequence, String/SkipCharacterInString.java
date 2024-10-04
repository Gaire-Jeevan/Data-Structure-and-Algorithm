public class SkipCharacterInString {
    public static void main(String[] args) {
        skip("", "a");

        // Method - II
        System.out.println(skipChar("bcadda"));

        // Skip string
        System.out.println(skipString("ramappleshyam"));

        // Skip string 2
        System.out.println(skipString2("jeevanapplegaireappcourse"));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a') {
            skip(p, up.substring(1));
        }
        else{
            skip(p + ch, up.substring(1));
        }
    }

    // passing string in parameter and manipulating it
    static String skipChar(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a') {
            return skipChar(str.substring(1));
        }
        else{
            // current answer and whatever we get from recursion
            return ch + skipChar(str.substring(1));
        }
    }

    // skipping string apple
    static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if(str.startsWith("apple")) {
            // it is making substring form 5 because the length of apple is 5 (apple) so after skipping this the new substring is created as 5 index
            return skipString(str.substring(5));
        }
        else{
            // current answer and whatever we get from recursion
            return str.charAt(0) + skipString(str.substring(1));
        }
    }

    // skipping string app when string is not apple, when it is apple it will not skip
    static String skipString2(String str) {
        if (str.isEmpty()) {
            return "";
        }

        // string starts with app but not apple
        if(str.startsWith("app") && !str.startsWith("apple")) {
            // it is making substring form 5 because the length of apple is 5 (apple) so after skipping this the new substring is created as 5 index
            return skipString2(str.substring(3));
        }
        else{
                // current answer and whatever we get from recursion
                return str.charAt(0) + skipString2(str.substring(1));
        }
    }
}
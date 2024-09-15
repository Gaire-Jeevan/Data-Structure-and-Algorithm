public class Performance {
    public static void main(String[] args) {
        String series = "";
        
        // this is not a good way to concatenate string with character as it create new object of String everytime so it make large space wastage (the previous string will left with no refrence variable)
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
        
            series = series + ch;
            
        }
        System.out.println(series);
    }

    // it's solution is StringBuilder it is the class like String
}

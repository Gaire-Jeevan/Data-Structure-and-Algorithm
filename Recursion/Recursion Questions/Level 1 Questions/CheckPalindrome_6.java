public class CheckPalindrome_6 {

    static int reverseNumber2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function 
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        // if number is 1 digit number
        if(n%10 == n) {
            return n;
        }
        int  remainder = n % 10;
        return remainder * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }

    static boolean checkPalindrome(int n) {
        return n == reverseNumber2(n);
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome(1021));
    }

}

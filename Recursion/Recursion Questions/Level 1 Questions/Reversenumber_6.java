public class Reversenumber_6 {

    // sum is outside the function
    static int sum = 0;

    public static void main(String[] args) {
        reverseNumber1(72845);
        System.out.println(sum);

        System.out.println(reverseNumber2(1234));
    }

    static void reverseNumber1(int n) {
        if(n == 0) {
            return;
        }

        int remainder = n % 10;
        sum = sum * 10 + remainder;
        reverseNumber1(n / 10);
    }

    // METHOD II
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
}

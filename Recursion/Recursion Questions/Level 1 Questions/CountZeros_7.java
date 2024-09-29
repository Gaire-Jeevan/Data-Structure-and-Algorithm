public class CountZeros_7 {
    public static void main(String[] args) {
        System.out.println(countZeros(30201));
    }

    static int countZeros(int n){
        return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    private static int helper(int n, int c) {
        if( n == 0) {
            return c;
        }

        int rem = n % 10;

        if (rem == 0) {
            return helper(n / 10, c+1);
        }
        else{
            return helper(n / 10, c);
        }
    }
}

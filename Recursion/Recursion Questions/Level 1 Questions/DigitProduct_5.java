public class DigitProduct_5 {
    public static void main(String[] args) {
        int ans = digitProduct(1342);
        System.out.println(ans);
    }

    static int digitProduct(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * digitProduct(n / 10);
    }
}

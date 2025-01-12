import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(345678953);

        // for really large number we can pass it as string
        BigInteger C = new BigInteger("2566546546546546464656856232856");
        System.out.println( C);

        // constants 
        BigInteger D = BigInteger.TEN;

        // addItem
        BigInteger s = A.add(B);

        BigInteger m = C.multiply(B);

        BigInteger remainder = C.remainder(A);

        System.out.println(remainder);

        System.out.println(m);

        System.out.println(s);

        System.out.println(Factorial.fact(234567));
    }

}
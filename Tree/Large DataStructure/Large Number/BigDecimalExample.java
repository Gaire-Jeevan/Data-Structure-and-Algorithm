import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");

        System.out.println((double)0.04 - (double)0.03);
        System.out.println(Y.subtract(X));

        BigDecimal A = new BigDecimal("5245866231.23665");
        BigDecimal B = new BigDecimal("8546234894221663.216655878");

        // operations
        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.pow(3));
        System.out.println(A.negate());

        // constants
        BigDecimal con = BigDecimal.ONE;
        System.out.println(con);
    }
}

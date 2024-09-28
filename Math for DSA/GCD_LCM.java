import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers for which you want to calculate (gcd) and (lcm):");
        System.out.print("Enter first number:- ");
        int a = sc.nextInt();

        System.out.print("Enter second number:- ");
        int b = sc.nextInt();

        int gcd = gcd(a, b);
        System.out.println("The gcd of 2 number " + a + " and " + b + " is " + gcd);

        int lcm = lcm(a, b);
        System.out.println("The lcm of 2 number " + a + " and " + b + " is " + lcm);

        sc.close();
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;  /* because gcd of (0, 300) is 300 as 300 is factor of 0 */
        }

        /* Euclid Algorithm --> to calculate gcd */
        return gcd(b % a, a);
    }


    // LCM --> lowest common multiplication i.e. the lowest (smaller) number that is divided by both a & b.
    static int lcm(int a, int b) {

        /* LCM x HCF = a x b */
        
        return (a * b ) / gcd(a, b);
    }
}

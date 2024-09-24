import java.util.Scanner;

public class CountSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int n = sc.nextInt();

        int answer = countSetBits(n);
        System.out.println("The number has " + answer + " set bits.");

        sc.close();
    }

    static int countSetBits(int n) {
        int count = 0;

        while (n >  0) {

            // METHOD- I
            // n & -n gives right most set bit
            // n = (n - (n & -n));
            // count++;

            // METHOD -II
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}

import java.util.Scanner;

public class RangeXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // range XOR for a, b = XOR(b) ^ XOR(a - 1)
        System.out.print("Enter the 1st number in range from where you want to calculate XOR:- ");
        int a = sc.nextInt();

        System.out.print("Enter the 2st number in range till where you want to calculate XOR:- ");
        int b = sc.nextInt();

        int ans = calculateXOR(b)  ^ calculateXOR(a - 1);
        System.out.println("The XOR form range " + a + " and " + b + " is " + ans);

        sc.close();
    }

    // this gives XOR from 0 to a
    static int calculateXOR(int a) {
        if(a % 4 == 0) {
            return a;
        }
        if(a % 4 == 1) {
            return 1;
        }

        if(a % 4 == 2) {
            return a + 1;
        }

        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }
}

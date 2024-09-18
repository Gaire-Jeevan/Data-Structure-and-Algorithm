import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();
        int ans = fibonacci(n);
        System.out.println("The fibonacci of " + n + " is " + ans);
    }

    static int fibonacci(int n) {
        if(n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n- 2);
    }
}
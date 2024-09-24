import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();

        boolean result = powerOfTwo(n);
        System.out.println(result ? "The number is power of 2." : "The number is not power of 2.");

        sc.close();
    }

    static boolean powerOfTwo(int n) {
        if((n & (n - 1)) == 0){
            return true;
        }
        return false;
    }
}

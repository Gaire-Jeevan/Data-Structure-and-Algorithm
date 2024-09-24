import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which you want to calculate magic number:- ");
        int number = sc.nextInt();

        System.out.println("The magic number of "+ number + " is " +calculateMagicNumber(number));

        sc.close();
    }

    static int calculateMagicNumber(int n) {
        int ans = 0;
        int base = 5;

        while (n > 0) {
            // any number '''& 1''' give last digit
            int last = n & 1;

            // right shift --> to shift the number whose calculation is done
            n = n >> 1;

            // it is to calculate magic number
            ans += last * base;

            // the degree of 5 increase every time 
            base = base * 5;
        }
        return ans;
    }
}
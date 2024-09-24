import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number:- ");
        int number = sc.nextInt();

        System.out.print("Base:- ");
        int base = sc.nextInt();

        System.out.println("The digit present in base " + base + " of number " + number + " is " + count(number, base));

        sc.close();
    }

    public static int count(int n, int base) {

        // if you want to create base of log(n) then divide log(n) with log(b) where b is base
        return (int) (Math.log(n) / Math.log(base)) + 1;
    }
}

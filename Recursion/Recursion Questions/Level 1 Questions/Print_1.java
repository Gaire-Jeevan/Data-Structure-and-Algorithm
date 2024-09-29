public class Print_1 {
    public static void main(String[] args) {
        System.out.println("Printing in ascending order:- ");
        print(5);

        System.out.println("Printing in reverse order:- ");
        printReverse(5);

        System.out.println("Printing in both order:- ");
        printBoth(5);
    }

    static void print(int n){
        if(n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);

    }

    static void printReverse(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printReverse(n - 1);
    }

    static void printBoth(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);
    }
}

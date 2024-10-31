public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try {
            // int c = a / b;
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal exception");
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // explictly throw something
            throw new ArithmeticException("Please do not divide by zero");
        }

        return a / b;
    }
}
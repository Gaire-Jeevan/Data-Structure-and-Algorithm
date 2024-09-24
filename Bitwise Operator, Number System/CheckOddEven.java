public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println(checkOddEven(28));
    }

    static String checkOddEven(int num){
        return (num & 1) == 1 ? "The given number is odd": "The given number is even";
    }
}
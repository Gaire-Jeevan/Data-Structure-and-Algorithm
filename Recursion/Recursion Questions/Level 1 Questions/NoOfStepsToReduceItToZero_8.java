public class NoOfStepsToReduceItToZero_8 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(41));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num/2, steps + 1);
        }
        else{
            return helper(num - 1, steps + 1);
        }
    }
}

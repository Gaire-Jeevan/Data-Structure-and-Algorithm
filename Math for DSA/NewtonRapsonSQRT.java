public class NewtonRapsonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n) {
        double x = n;
        double root;

        while(true) {
            root = 0.5 * (x + (n / x)); /* ''''1/2 *[(x + (n / x)]'''' */ 

            // < 1 is precision value we can take any presicion value or hard coded value if we want exact sqrt
            if(Math.abs(root - x) < 0.1) {
                break;
            }
            
            x = root;
        }
        return root;
    }
}

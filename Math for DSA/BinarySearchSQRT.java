public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; /* precision value --> till which I need this decimal value */

        System.out.println(sqrt(n, p));

    }

    // TIME:- O(log(n))
    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;

        double root = 0.0;
        int middle = (start + end) / 2;

        while (start <= end) {
            middle = (start + end) / 2;

            if(middle * middle == n) {
                return middle;
            }

            if (middle * middle > n) {
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }

        // root should be end because while conditon become false the end is less than the start one. so we should check for small value
        root = end;

        /* for precision --> the number of digits I need after decimal */
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            } 

            /* now while loop break that means this go 1 step up i.e 6.4 for 40 so need to reduce it '''0.4 - 0.1'''*/
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}

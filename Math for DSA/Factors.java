import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1(40);
        factos2(40);
        factos3(40);
    }

    // Time complexity: O(N)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }


    // Time complexity: O(N)
    static void factos2(int n) {
        /* checking upto sqrt(n) so that double calculation of factor is eliminated i.e 4 * 5 = 20 then 4, 5 both are factors as they both invlolve to make 20.. here no need to calculate 5 * 4 = 20 */
        System.out.println();
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                /* this is for perfect square like in a case 6 * 6 = 36 then if this condition is not there it will return 2 times 6 */
                if((n / i) == i) {
                    System.out.print(i + " ");
                }
                else{
                    /* because if 4 * 5 = 50 then one factor is 4 and another factor is 20 / 4 i.e. 5 */
                    System.out.print(i + " " + (n / i) + " ");
                }
            }
        }
    }

    // both time and space will be o(sqrt(n))
    static void factos3(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        /* checking upto sqrt(n) so that double calculation of factor is eliminated i.e 4 * 5 = 20 then 4, 5 both are factors as they both invlolve to make 20.. here no need to calculate 5 * 4 = 20 */
        System.out.println();
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                /* this is for perfect square like in a case 6 * 6 = 36 then if this condition is not there it will return 2 times 6 */
                if((n / i) == i) {
                    System.out.print(i + " ");
                }
                else{
                    /* because if 4 * 5 = 50 then one factor is 4 and another factor is 20 / 4 i.e. 5 */
                    System.out.print(i + " " );
                    list.add(n/i);
                }
            }
        }

        // printing in descending order because the number stored here is stored from last factor i.e. 1 * 40 = 40 , i.e 40 will be stored
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i)  + " ");
        }
    }
}

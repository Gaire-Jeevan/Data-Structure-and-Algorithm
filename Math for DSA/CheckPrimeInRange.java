// check prime in range 0 to n

public class CheckPrimeInRange {
    public static void main(String[] args) {
        int n = 40;

        // n should be included then the size should be '''n + 1'''
        boolean[] primes = new boolean[n + 1];
        checkPrime(n, primes);
    }


    // Sieve of Eratosthenes method

    // false in array means number is prime
    static void checkPrime(int n, boolean[] primes) {

        for (int i = 2; i * i <= n; i++) {
            // check if number is already elemenated like in a case of 4 as it is multiple of 2
            if(!primes[i]) {
                // making multiple of 2 and so on till squareroot(n) false
                for (int j = i * 2; j < n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        // printing numbers
        for (int i = 2; i < n; i++) {
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

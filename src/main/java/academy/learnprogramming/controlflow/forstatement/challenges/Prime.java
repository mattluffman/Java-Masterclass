package academy.learnprogramming.controlflow.forstatement.challenges;

/**
 * section 5, lecture 65 - final challenge on prime numbers
 *
 * @author Matt Luffman
 * Date: 5/5/2021
 * Time: 5:53 PM
 */
public class Prime {

    // create for with any range of #
    // determine if the number is prime by using provided method
    // if prime, print it out & increment # of prime #s
    // once count hits 3 exit loop
    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 1; i < 501; ++i) {
            if (primeCount == 10) {
                break;
            }

            if (isPrime(i)) {
                System.out.printf("number %d is prime!%n", i);
                primeCount++;
            }
        }
    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

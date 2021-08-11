package academy.learnprogramming.controlflow.whiledowhile.exercises;

/**
 * section 5, exercise 25
 *
 * @author Matt Luffman
 * Date: 6/2/2021
 * Time: 6:13 PM
 */
public class LargestPrime {

    /**
     * Write a method named getLargestPrime with one parameter of type int named number.
     *
     * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
     *
     * The method should calculate the largest prime factor of a given number and return it.
     *
     *
     * EXAMPLE INPUT/OUTPUT:
     *
     * * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
     * * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
     * * getLargestPrime (0); should return -1 since 0 does not have any prime numbers
     * * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
     * * getLargestPrime (-1); should return -1 since the parameter is negative
     *
     *
     * HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
     * NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
     * NOTE: Do not add a main method to the solution code.
     */
    public static int getLargestPrime(int number) {
        int largestPrime = -1;
        if (number >= 2) {
            for (int i = 2; i <= number; ++i) {
                // if is a factor
                if (number % i == 0) {
                    System.out.println(i + " is a factor");
                    boolean isIPrime = true;
                    // is prime
                    for (int j = 2; j <= Math.sqrt(i); ++j) {
                        if (i % j == 0) {
                            isIPrime = false;
                            break;
                        }
                    }

                    if (isIPrime) {
                        largestPrime = i;
                    }
                }
            }
        }

        return largestPrime;
    }

    //TODO look at this solution from Ariel: https://www.udemy.com/course/java-the-complete-java-developer-course/learn/quiz/4448802#questions/8842562
    /*
    public class LargestPrime {
    public static int getLargestPrime (int number) {
        if (number<2) return -1;
        for (int i=number/2; i>1; i--) {
            if(number%i==0) number=i;
        }
        return number;
    }
}
     */
}

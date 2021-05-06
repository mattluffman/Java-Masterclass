package academy.learnprogramming.controlflow.forstatement.challenges;

/**
 * section 5, lecture 67 - sum 3 & 5 challenge
 *
 * @author Matt Luffman
 * Date: 5/6/2021
 * Time: 5:59 PM
 */
public class Sum3And5 {

    /**
     * create a for statement using a range of #s from 1-1k inclusive
     * sum all the numbers that can be divided with both 3 & 5
     * for the #'s that meet the condition, print itout
     * break out of loop when you find 5 #'s that meet the above condition
     * after breaking, print sum
     */
    public static void main(String[] args) {
        final int COUNT_LIMIT = 5; // making this configurable
        long sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " is divisible by 3 & 5");
                sum += i;
                ++count;

                if (count == COUNT_LIMIT) {
                    break;
                }
            }
        }

        System.out.println("Sum of " + COUNT_LIMIT + " numbers that were divisible by 3 & 5: " + sum);
    }
}

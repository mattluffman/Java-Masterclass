package academy.learnprogramming.controlflow.forstatement;

/**
 * section 5, lecture 65
 *
 * @author Matt Luffman
 * Date: 4/28/2021
 * Time: 6:29 PM
 */
public class For {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        // for format
        /*for (init; termination; incrmenent) {
        }*/
        for (int i = 1; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // mini challenge
        // using for, call the method below for values 2-8, with amount 10k
        for (int i = 2; i < 9; ++i) { // i scope is only within the for block
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}

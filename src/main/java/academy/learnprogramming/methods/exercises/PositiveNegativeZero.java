package academy.learnprogramming.methods.exercises;

/**
 * section 4, coding exercise example
 *
 * @author Matt Luffman
 * Date: 4/19/2021
 * Time: 11:43 PM
 */
public class PositiveNegativeZero {

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }
}

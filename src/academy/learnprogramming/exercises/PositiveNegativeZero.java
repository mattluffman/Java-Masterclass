package academy.learnprogramming.exercises;

/**
 * @author Matt Luffman
 * Date: 4/19/2021
 * Time: 11:43 PM
 * @since A.P. 5.0
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

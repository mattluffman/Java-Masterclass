package academy.learnprogramming.exercises;

/**
 * lecture 55, coding exercise speed converter
 *
 * @author Matt Luffman
 * Date: 4/19/2021
 * Time: 11:55 PM
 * @since A.P. 5.0
 */
public class SpeedConverter {

    public static void printConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);
        if (result == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long result;
        if (kilometersPerHour < 0) {
            result = -1;
        } else {
            double exactMph = kilometersPerHour / 1.609d;
            result = Math.round(exactMph);
        }
        return result;
    }
}

package academy.learnprogramming.exercises;

/**
 * @author Matt Luffman
 * Date: 4/20/2021
 * Time: 12:43 AM
 * @since A.P. 5.0
 */
public class Main {

    public static void main(String[] args) {
        testSpeedConverter();
        // testPositiveNegativeZero();
    }

    public static void testPositiveNegativeZero() {
        PositiveNegativeZero.checkNumber(5);
        PositiveNegativeZero.checkNumber(-10);
        PositiveNegativeZero.checkNumber(0);
    }

    private static void testSpeedConverter() {
        /*System.out.println(SpeedConverter.toMilesPerHour(1.5) == 1);
        System.out.println(SpeedConverter.toMilesPerHour(10.25) == 6);
        System.out.println(SpeedConverter.toMilesPerHour(-5.6) == -1);
        System.out.println(SpeedConverter.toMilesPerHour(25.42) == 16);
        System.out.println(SpeedConverter.toMilesPerHour(75.114) == 47);*/

        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
        SpeedConverter.printConversion(0.0);
    }
}

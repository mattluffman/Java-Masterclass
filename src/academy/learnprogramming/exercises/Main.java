package academy.learnprogramming.exercises;

/**
 * @author Matt Luffman
 * Date: 4/20/2021
 * Time: 12:43 AM
 */
public class Main {

    public static void main(String[] args) {
        // testPositiveNegativeZero();
        // testSpeedConverter();
        testMegaBytesConverter();
    }

    public static void testPositiveNegativeZero() {
        PositiveNegativeZero.checkNumber(5);
        PositiveNegativeZero.checkNumber(-10);
        PositiveNegativeZero.checkNumber(0);
    }

    private static void testSpeedConverter() {
        /*
        System.out.println(SpeedConverter.toMilesPerHour(1.5) == 1);
        System.out.println(SpeedConverter.toMilesPerHour(10.25) == 6);
        System.out.println(SpeedConverter.toMilesPerHour(-5.6) == -1);
        System.out.println(SpeedConverter.toMilesPerHour(25.42) == 16);
        System.out.println(SpeedConverter.toMilesPerHour(75.114) == 47);
        */

        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
        SpeedConverter.printConversion(0.0);
    }

    private static void testMegaBytesConverter() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500); // "2500 KB = 2 MB and 452 KB"
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024); // "Invalid Value" because parameter is less than 0.
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000); // "5000 KB = 4 MB and 904 KB"
    }
}

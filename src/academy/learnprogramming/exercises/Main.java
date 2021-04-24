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
        // testMegaBytesConverter();
        // testBarkingDog();
        // testLeapYear();
        // testDecimalComparitor();
        testEqualSumChecker();
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

    private static void testBarkingDog() {
        assert BarkingDog.shouldWakeUp(true, 1); // should return true
        assert !BarkingDog.shouldWakeUp(false, 2); // should return false since the dog is not barking.
        assert !BarkingDog.shouldWakeUp(true, 8); // should return false, since it's not before 8.
        assert !BarkingDog.shouldWakeUp(true, -1); // should return false since the hourOfDay parameter needs to be in a range 0-23.
    }

    private static void testLeapYear() {
        assert !LeapYear.isLeapYear(-1600); //  should return false since the parameter is not in range (1-9999)
        assert LeapYear.isLeapYear(1600);  // should return true since 1600 is a leap year
        assert !LeapYear.isLeapYear(2017);  // should return false since 2017 is not a leap year
        assert LeapYear.isLeapYear(2000);  //  should return true because 2000 is a leap year
    }
    
    private static void testDecimalComparitor() {
        assert DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175); // should return true since numbers are equal up to 3 decimal places.
        assert !DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176); // should return false since numbers are not equal up to 3 decimal places
        assert DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0); // should return true since numbers are equal up to 3 decimal places.
        assert !DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123); // should return false since numbers are not equal up to 3 decimal places.
    }

    private static void testEqualSumChecker() {
        assert !EqualSumChecker.hasEqualSum(1, 1, 1);  // should return false since 1 + 1 is not equal to 1
        assert EqualSumChecker.hasEqualSum(1, 1, 2);  // should return true since 1 + 1 is equal to 2
        assert EqualSumChecker.hasEqualSum(1, -1, 0);  // should return true since 1 + (-1) is 1 - 1 and is equal to 0
    }
}

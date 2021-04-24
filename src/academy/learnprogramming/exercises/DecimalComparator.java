package academy.learnprogramming.exercises;

/**
 * section 4, exercise 5
 * I shamefully could not figure this out
 * @author Matt Luffman
 * Date: 4/24/2021
 * Time: 4:23 PM
 */
public class DecimalComparator {

    /**
     * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
     *
     * The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
     *
     *
     * EXAMPLES OF INPUT/OUTPUT:
     *
     * * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
     * * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
     * * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
     * * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
     *
     *
     * TIP: Use paper and pencil.
     * TIP: Use casting.
     *
     * NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
     * NOTE: Do not add a  main method to solution code.`
     */
    public static boolean areEqualByThreeDecimalPlaces(double decimal1, double decimal2) {
        // I shamefully could not figure this out & tried some string thing that was a waste of time
        return (int) (decimal1 * 1000) == (int) (decimal2 * 1000);
    }
}

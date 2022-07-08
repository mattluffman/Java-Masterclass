package academy.learnprogramming.arrays.exercises;

/**
 * section 8 exercises
 *
 * @author Matt Luffman
 * Date: 5/3/2022
 * Time: 6:44 PM
 */
public class ArraysExerciseRunner {

    public static void main(String[] args) {
        System.out.println("Running SortedArray exercise");
        runSortedArrayExercise();
        System.out.println("\n");

        System.out.println("Running MinimumElement exercise");
        runMinimumElementExercise();
        System.out.println("\n");

        System.out.println("Running ReverseArray exercise");
        runReverseArrayExercise();
    }

    private static void runSortedArrayExercise() {
        int[] nums = {106, 26, 105, 81, 5, 15}; // testing :D
        nums = SortedArray.getIntegers(5); // production :P
        SortedArray.printArray(nums);
        int[] sorted = SortedArray.sortIntegers(nums);
        SortedArray.printArray(sorted);
    }

    private static void runMinimumElementExercise() {
        final int count = MinimumElement.readInteger();
        System.out.println("Count = " + count);
        int[] values = MinimumElement.readElements(count);
        final int min = MinimumElement.findMin(values);
        System.out.println("Min = " + min);
    }

    private static void runReverseArrayExercise() {
        int[] array = {1, 2, 3, 4, 5};
        ReverseArray.reverse(array);
    }
}

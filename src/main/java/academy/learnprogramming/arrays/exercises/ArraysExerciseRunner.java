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
        int[] nums = {106, 26, 105, 81, 5, 15}; // testing :D
        nums = SortedArray.getIntegers(5); // production :P
        SortedArray.printArray(nums);
        int[] sorted = SortedArray.sortIntegers(nums);
        SortedArray.printArray(sorted);
    }
}

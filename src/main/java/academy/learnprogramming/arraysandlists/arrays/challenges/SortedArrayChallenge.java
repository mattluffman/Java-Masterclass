package academy.learnprogramming.arraysandlists.arrays.challenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * section 8, lecture 100 - Arrays challenge
 * Dev note: I started exercise 41 back on 5/6/22. I got everything done except the sorting.
 * I am not revisiting that example to do this one, I'll do it from scratch again.
 *
 * @author Matt Luffman
 * Date: 6/24/2022
 * Time: 3:50 PM
 */
public class SortedArrayChallenge {

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Create a program using arrays that sorts a list of integers in descending order.
     * Descending order is highest value to lowest.
     * In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
     * ultimately have an array with 106,81,26, 15, 5 in it.
     * Set up the program so that the numbers to sort are read in from the keyboard.
     * Implement the following methods - getIntegers, printArray, and sortIntegers
     * getIntegers returns an array of entered integers from keyboard
     * printArray prints out the contents of the array
     * and sortIntegers should sort the array and return a new array containing the sorted numbers
     * you will have to figure out how to copy the array elements from the passed array into a new
     * array and sort them and return the new sorted array.
     */
    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        // int[] numbers = {106, 26, 81, 5, 15};
        // int[] numbers = {106, 26, 105, 81, 5, 15};

        int[] sorted = sortIntegers(numbers);
        printArray(sorted);

        // instructor example added below
        sorted = sortIntegersInstructor(numbers);
        printArrayInstructor(sorted);
    }

    /**
     * sorts int array in descending order, first using a bubble sort, then reversing it.
     * this is unoptimized
     *
     * @param numbers array of numbers to sort
     * @return new array that is sorted in descending order
     */
    public static int[] sortIntegers(int[] numbers) {
        // make a copy to operate on
        int[] sorted = numbers.clone();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) { // move j+1 into the j position
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return reverse(sorted);
    }

    // TODO: try swapping algorithm outlined here: https://www.geeksforgeeks.org/reverse-an-array-in-java/
    private static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];

        int j = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            reversed[j - 1] = numbers[i];
            j -= 1; // decrement j by 1
        }

        return reversed;
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = SCANNER.nextInt();
        }

        return values;
    }

    public static void printArray(int[] numbers) {
        System.out.println("Array contents");
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * his version of my {@link #printArray(int[])}
     *
     * @param array numbers to print
     */
    public static void printArrayInstructor(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    /**
     * his version of my {@link #sortIntegers(int[])}
     *
     * @param array numbers
     * @return reverse sorted ints
     */
    public static int[] sortIntegersInstructor(int[] array) {
        // manually create a clone
        int[] sortedArray;// = new int[array.length];
        // for (int i = 0; i < array.length; i++) {
        //     sortedArray[i] = array[i];
        // }
        sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}

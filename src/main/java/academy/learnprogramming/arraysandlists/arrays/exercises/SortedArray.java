package academy.learnprogramming.arraysandlists.arrays.exercises;

import java.util.Scanner;

/**
 * section 8, exercise 41
 *
 * @author Matt Luffman
 * Date: 5/3/2022
 * Time: 6:45 PM
 */
public class SortedArray {

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sorted = array.clone();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (sorted[j] <= sorted[j + 1]) { // move j+1 into the j position
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return sorted;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %s contents %s%n", i, array[i]);
        }
    }
}

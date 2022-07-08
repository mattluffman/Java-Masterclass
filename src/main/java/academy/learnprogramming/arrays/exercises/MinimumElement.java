package academy.learnprogramming.arrays.exercises;

import java.util.Scanner;


/**
 * section 8, exercise 42
 *
 * Write a method called readInteger() that has no parameters and returns an int.
 *
 * It needs to read in an integer from the user - this represents how many elements the user needs to enter.
 *
 * Write another method called readElements() that has one parameter of type int
 *
 * The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
 *
 * And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
 *
 * The scenario is:
 *
 * 1. readInteger() is called.
 *
 * 2. The number returned by readInteger() is then used to call readElements().
 *
 * 3. The array returned from readElements() is used to call findMin().
 *
 * 4. findMin() returns the minimum number.
 *
 * [Do not try and implement this. It is to give you an idea of how the methods will be used]
 *
 * TIP: Assume that the user will only enter numbers, never letters.
 *
 * TIP: Instantiate (create) the Scanner object inside the method. There are two scanner objects, one for each of the two methods that are reading in input from the user.
 *
 * TIP: Be extremely careful about spaces in the printed message.
 *
 * NOTE: All methods should be defined as private static.
 *
 * NOTE: Do not add a main method to the solution code.
 *
 * @author Matt Luffman
 * Date: 7/8/2022
 * Time: 6:08 PM
 */
public class MinimumElement {

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        // removing the below code for the following reason:
        /*
         * That's because the scanner uses System.in for the operation of reading and getting info from console
         * scanner.close also closes System.in which is only defined once and so when you make a new scanner
         * object System.in is still closed so scanner is closed too as it cant read get info from it anymore.
         */
        // scanner.close();
        return number;
    }

    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[count];
        for (int i = 0; i < count; ++i) {
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return values;
    }

    public static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}

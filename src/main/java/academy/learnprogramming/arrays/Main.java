package academy.learnprogramming.arrays;

import java.util.Scanner;

/**
 * section 8, lecture 99 - Arrays
 *
 * @author Matt Luffman
 * Date: 6/24/2022
 * Time: 12:11 PM
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // tedious way to setup
        int[] myIntArray1 = new int[10];
        myIntArray1[0] = 45;
        myIntArray1[1] = 476;
        myIntArray1[5] = 50; // saves in the 6th spot
        System.out.println(myIntArray1[5]);

        //even better than above
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[6]);
        System.out.println(myIntArray2[8]);

        // setup using a loop
        int[] myIntArray3 = new int[25];
        for (int i = 0; i < myIntArray3.length; ++i) {
            myIntArray3[i] = i * 10;
        }

        printArray(myIntArray3);

        // example of how to actually use this. He cleared out the code above, but I'm
        // leaving it for the sake of history
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}

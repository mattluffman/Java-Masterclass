package academy.learnprogramming.arrays;

import java.util.Arrays;

/**
 * section 8, lecture 102
 *
 * @author Matt Luffman
 * Date: 7/8/2022
 * Time: 12:44 AM
 */
public class ReferenceVsValue {

    public static void main(String[] args) {
        // variable types
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 10

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 11

        // reference types
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // [0, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // [0, 0, 0, 0, 0]

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray)); // [1, 0, 0, 0, 0]
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray)); // [1, 0, 0, 0, 0]

        anotherArray = new int[]{4, 5, 6, 7, 8}; // derefernece before the change in modify array, it now points to new memory
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray)); // [2, 0, 0, 0, 0]
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray)); // [2, 0, 0, 0, 0]
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5}; // dereferencing the reference
    }
}

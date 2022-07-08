package academy.learnprogramming.arrays.challenges;

import java.util.Arrays;

/**
 * section 8, lecture 104
 *
 * @author Matt Luffman
 * Date: 7/8/2022
 * Time: 7:01 PM
 */
public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Regular: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed: " + Arrays.toString(array));
    }

    /**
     * instructor example notes:
     * he uses a maxIndex variable & half length variable
     *
     * <pre>
     * int maxIndex = array.length - 1;
     * int halfLength = array.length / 2;
     * for (int i = 0; i < halfLength; ++i) {
     *     int temp = array[i];
     *     array[i] = array[maxIndex - i];
     *     array[maxIndex - i] = temp;
     * }
     * </pre>
     */
    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; ++i) { // int division makes this work for even & odd length arrays
            int front = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = front;
        }
    }
}

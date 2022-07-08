package academy.learnprogramming.arrays.challenges;

import java.util.Scanner;

/**
 * section 8, lecture 103
 *
 * @author Matt Luffman
 * Date: 7/8/2022
 * Time: 1:16 AM
 */
public class MinElementChallenge {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many numbers you want to input");
        int count = SCANNER.nextInt();
        int[] numbers = readIntegers(count);
        System.out.println("minimum = " + findMin(numbers));
    }

    /**
     * stealing this from the past challenges {@link SortedArrayChallenge#getIntegers(int)}
     */
    public static int[] readIntegers(int count) {
        return SortedArrayChallenge.getIntegers(count);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

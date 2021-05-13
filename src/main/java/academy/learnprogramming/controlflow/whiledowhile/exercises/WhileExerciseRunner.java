package academy.learnprogramming.controlflow.whiledowhile.exercises;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.SharedDigit.hasSharedDigit;

/**
 * section 5 - main method for exercises on while & do while loops
 *
 * @author Matt Luffman
 * Date: 5/13/2021
 * Time: 5:06 PM
 */
public class WhileExerciseRunner {

    public static void main(String[] args) {
        testHasSharedDigit();
    }

    private static void testHasSharedDigit() {
        System.out.println("hasSharedDigit(12, 23); should return true: " + hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(9, 99); should return false: " + hasSharedDigit(9, 99));
        System.out.println("hasSharedDigit(15, 55); should return true: " + hasSharedDigit(15, 55));
        System.out.println("hasSharedDigit(20, 30); should return true: " + hasSharedDigit(20, 30));
    }
}

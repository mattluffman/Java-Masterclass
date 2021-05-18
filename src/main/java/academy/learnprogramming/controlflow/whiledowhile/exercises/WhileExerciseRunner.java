package academy.learnprogramming.controlflow.whiledowhile.exercises;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.EvenDigitSum.getEvenDigitSum;
import static academy.learnprogramming.controlflow.whiledowhile.exercises.FirstLastDigitSum.sumFirstAndLastDigit;
import static academy.learnprogramming.controlflow.whiledowhile.exercises.PalindromeChecker.isPalindrome;
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
        testIsPalindrome();
        testSumFirstAndLast();
        testEvenDigitSum();
    }

    private static void testHasSharedDigit() {
        System.out.println("hasSharedDigit(12, 23); should return true: " + hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(9, 99); should return false: " + hasSharedDigit(9, 99));
        System.out.println("hasSharedDigit(15, 55); should return true: " + hasSharedDigit(15, 55));
        System.out.println("hasSharedDigit(20, 30); should return true: " + hasSharedDigit(20, 30));
    }

    private static void testIsPalindrome() {
        System.out.println("707 is a palindrome: " + isPalindrome(707));
        System.out.println("-1221 is a palindrome: " + isPalindrome(-1221));
        System.out.println("11212 is NOT a palindrome: " + isPalindrome(11212));
        System.out.println("1001 is a palindrome: " + isPalindrome(1001));
    }

    private static void testSumFirstAndLast() {
        System.out.println("sumFirstAndLastDigit(252) should return 4: " + sumFirstAndLastDigit(252));
    }

    private static void testEvenDigitSum() {
        System.out.println("getEvenDigitSum(123456789) should be 20: " + getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(13579) should be 0: " + getEvenDigitSum(13579));
    }
}

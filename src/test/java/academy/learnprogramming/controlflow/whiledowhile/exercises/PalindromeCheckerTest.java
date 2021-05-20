package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.PalindromeChecker.isPalindrome;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * tests for {@link PalindromeChecker#isPalindrome(int)}
 *
 * @author Matt Luffman
 * Date: 5/13/2021
 * Time: 7:53 PM
 */
public class PalindromeCheckerTest {

    @Test
    public void lessThan10_positive() {
        assertTrue(isPalindrome(8));
    }

    @Test
    public void lessThan10_negative() {
        assertTrue(isPalindrome(-6));
    }

    @Test
    public void test_707() {
        assertTrue(isPalindrome(707));
    }

    @Test
    public void test_1221_negative() {
        assertTrue(isPalindrome(-1221));
    }

    @Test
    public void test_222_negative() {
        assertTrue(isPalindrome(-222));
    }

    @Test
    public void test_11212() {
        assertFalse(isPalindrome(11212));
    }

    @Test
    public void test_100() {
        assertFalse(isPalindrome(100));
    }
}
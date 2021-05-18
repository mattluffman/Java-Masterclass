package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.LastDigitChecker.hasSameLastDigit;
import static academy.learnprogramming.controlflow.whiledowhile.exercises.LastDigitChecker.isValid;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Matt Luffman
 * Date: 5/17/2021
 * Time: 8:47 PM
 */
public class LastDigitCheckerTest {

    @Test
    public void isValid_small_true() {
        assertTrue(isValid(10));
    }

    @Test
    public void isValid_small_false() {
        assertFalse(isValid(9));
    }

    @Test
    public void isValid_large_false() {
        assertFalse(isValid(1051));
    }

    @Test
    public void isValid_inRange() {
        assertTrue(isValid(468));
    }


    @Test
    public void lastDigit_invalid() {
        assertFalse(hasSameLastDigit(9, 99, 999));
    }

    @Test
    public void lastDigit_true() {
        assertTrue(hasSameLastDigit(23, 32, 42));
    }

    @Test
    public void lastDigit_false() {
        assertFalse(hasSameLastDigit(23, 32, 49));
    }
}
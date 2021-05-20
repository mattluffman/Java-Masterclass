package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.NumberToWords.getDigitCount;
import static academy.learnprogramming.controlflow.whiledowhile.exercises.NumberToWords.reverse;
import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 5/18/2021
 * Time: 6:01 PM
 */
public class NumberToWordsTest {

    @Test
    public void reverse_negative121() {
        assertEquals(-121, reverse(-121));
    }

    @Test
    public void reverse_1212() {
        assertEquals(2121, reverse(1212));
    }

    @Test
    public void reverse_1234() {
        assertEquals(4321, reverse(1234));
    }

    @Test
    public void reverse_100() {
        assertEquals(1, reverse(100));
    }

    @Test
    public void getDigitCount_0() {
        assertEquals(1, getDigitCount(0));
    }

    @Test
    public void getDigitCount_123() {
        assertEquals(3, getDigitCount(123));
    }

    @Test
    public void getDigitCount_negative12() {
        assertEquals(-1, getDigitCount(-12));
    }

    @Test
    public void getDigitCount_5200() {
        assertEquals(4, getDigitCount(5200));
    }

    @Test
    public void getDigitCount_102580() {
        assertEquals(6, getDigitCount(102580));
    }
}
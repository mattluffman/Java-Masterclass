package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.SumFirstAndLast.sumFirstAndLastDigit;
import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 5/13/2021
 * Time: 11:07 PM
 */
public class SumFirstAndLastTest {

    @Test
    public void test_negative() {
        assertEquals(-1, sumFirstAndLastDigit(-10));
    }

    @Test
    public void test_singleDigit_zero() {
        assertEquals(0, sumFirstAndLastDigit(0));
    }

    @Test
    public void test_singleDigit_positive() {
        assertEquals(10, sumFirstAndLastDigit(5));
    }

    @Test
    public void test_positive1() {
        assertEquals(4, sumFirstAndLastDigit(252));
    }

    @Test
    public void test_positive2() {
        assertEquals(9, sumFirstAndLastDigit(257));
    }
}
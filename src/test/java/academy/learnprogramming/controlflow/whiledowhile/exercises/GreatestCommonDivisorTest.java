package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.GreatestCommonDivisor.getGreatestCommonDivisor;
import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 5/17/2021
 * Time: 8:23 PM
 */
public class GreatestCommonDivisorTest {

    @Test
    public void testFive() {
        assertEquals(5, getGreatestCommonDivisor(25, 15));
    }

    @Test
    public void testNegative() {
        assertEquals(-1, getGreatestCommonDivisor(9, 18));
    }

    @Test
    public void testNine() {
        assertEquals(9, getGreatestCommonDivisor(81, 153));
    }
}
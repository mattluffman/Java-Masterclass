package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.EvenDigitSum.getEvenDigitSum;
import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 5/17/2021
 * Time: 8:14 PM
 */
public class EvenDigitSumTest {

    @Test
    public void longNumberTest() {
        assertEquals(20, getEvenDigitSum(123456789));
    }

    @Test
    public void testFour() {
        assertEquals(4, getEvenDigitSum(252));
    }

    @Test
    public void testNegative() {
        assertEquals(-1, getEvenDigitSum(-22));
    }
}
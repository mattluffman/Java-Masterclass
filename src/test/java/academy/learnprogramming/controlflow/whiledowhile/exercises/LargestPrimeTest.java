package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.LargestPrime.getLargestPrime;
import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 6/2/2021
 * Time: 6:14 PM
 */
public class LargestPrimeTest {

    @Test
    public void test1_positive() {
        assertEquals(31, getLargestPrime(217));
    }

    @Test
    public void test2_positive() {
        assertEquals(7, getLargestPrime(21));
    }

    @Test
    public void test3_positive() {
        assertEquals(5, getLargestPrime(45));
    }

    @Test
    public void test1_negative() {
        assertEquals(-1, getLargestPrime(0));
    }

    @Test
    public void test2_negative() {
        assertEquals(-1, getLargestPrime(-1));
    }

    @Test
    public void test_primeNumber() {
        assertEquals(7, getLargestPrime(7));
    }
}
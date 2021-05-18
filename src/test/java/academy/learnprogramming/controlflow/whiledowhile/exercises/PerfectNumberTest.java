package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.PerfectNumber.isPerfectNumber;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Matt Luffman
 * Date: 5/18/2021
 * Time: 5:47 PM
 */
public class PerfectNumberTest {

    @Test
    public void perfectNumbersTo100() {
        // the only perfect numbers between 1-100 are 6 & 28
        for (int i = 1; i <= 100; ++i) {
            if (isPerfectNumber(i) && i != 6 && i != 28) {
                fail(i + " is not a perfect number. 6 & 28 are the only perfect numbers under 100.");
            }
        }
    }

    @Test
    public void test_33550336() {
        assertTrue(isPerfectNumber(33550336));
    }
}
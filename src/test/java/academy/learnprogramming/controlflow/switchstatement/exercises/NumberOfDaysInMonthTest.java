package academy.learnprogramming.controlflow.switchstatement.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Matt Luffman
 * Date: 5/13/2021
 * Time: 1:51 PM
 */
public class NumberOfDaysInMonthTest {

    @Test
    public void getDaysInMonth_1_1() {
        assertTrue(true);
        assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(1, 1));
    }

    @Test
    public void isLeapYear_1() {
        assertFalse(NumberOfDaysInMonth.isLeapYear(1));
    }
}
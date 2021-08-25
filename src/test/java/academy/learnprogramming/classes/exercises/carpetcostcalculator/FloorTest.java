package academy.learnprogramming.classes.exercises.carpetcostcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 8/19/2021
 * Time: 6:07 AM
 */
public class FloorTest {

    @Test
    public void constructor_setsNonNegativeDefaults() {
        Floor f = new Floor(12.3, -2);
        // area should be 0
        assertEquals(0, f.getArea(), 0);

        f = new Floor(-1, 15);
        // area should still be 0
        assertEquals(0, f.getArea(), 0);

        f = new Floor(-12.3, -2);
        assertEquals(0, f.getArea(), 0);

        // here we can reasonably assume that both parameters are getting set to 0 when negaive
    }

    @Test
    public void getArea() {
        Floor f = new Floor(20.5, 27.42);
        final double expected = 562.11;

        assertEquals(expected, f.getArea(), 0.0);
    }
}
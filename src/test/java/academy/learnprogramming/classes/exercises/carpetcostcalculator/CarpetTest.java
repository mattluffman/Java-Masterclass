package academy.learnprogramming.classes.exercises.carpetcostcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 8/19/2021
 * Time: 6:06 AM
 */
public class CarpetTest {

    @Test
    public void test_constructor() {
        final double cost = 27.54;
        Carpet carpet = new Carpet(cost);
        assertEquals(cost, carpet.getCost(), 0.0);
    }

    @Test
    public void test_constructor_setsZero() {
        Carpet carpet = new Carpet(-6);
        assertEquals(0, carpet.getCost(), 0.0);
    }
}
package academy.learnprogramming.classes.exercises.carpetcostcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 8/19/2021
 * Time: 6:06 AM
 */
public class CalculatorTest {

    @Test
    public void getTotalCost() {
        Floor floor = new Floor(10, 12);
        Carpet carpet = new Carpet(8);

        Calculator calculator = new Calculator(floor, carpet);

        assertEquals(960, calculator.getTotalCost(), 0.0);
    }
}
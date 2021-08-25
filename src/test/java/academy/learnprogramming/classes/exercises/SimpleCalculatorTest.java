package academy.learnprogramming.classes.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 6/2/2021
 * Time: 11:13 AM
 */
public class SimpleCalculatorTest {

    SimpleCalculator calculator;

    @Before
    public void setup() {
        calculator = new SimpleCalculator();

    }

    @Test
    public void testAdd() {
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        assertEquals(9.0, calculator.getAdditionResult(), 0.0);
    }

    @Test
    public void testSubtract() {
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        assertEquals(1.0, calculator.getSubtractionResult(), 0.0);
    }

    @Test
    public void testMulitply_zero() {
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        assertEquals(0.0, calculator.getMultiplicationResult(), 0.0);
    }

    @Test
    public void testMulitply_nonZero() {
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(2);
        assertEquals(10.5, calculator.getMultiplicationResult(), 0.0);
    }

    @Test
    public void testDivide_zero() {
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        assertEquals(0.0, calculator.getDivisionResult(), 0.0);
    }

    @Test
    public void testDivide_nonZero() {
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(2);
        assertEquals(2.625, calculator.getDivisionResult(), 0.0);
    }
}
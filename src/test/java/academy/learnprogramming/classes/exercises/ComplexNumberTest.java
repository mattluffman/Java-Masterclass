package academy.learnprogramming.classes.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 8/31/2021
 * Time: 6:16 PM
 */
public class ComplexNumberTest {

    @Test
    public void add_twoParam_1() {
        ComplexNumber a = new ComplexNumber(5, 3);
        ComplexNumber b = new ComplexNumber(4, 2);

        a.add(b.getReal(), b.getImaginary());
        assertEquals(9, a.getReal(), 0);
        assertEquals(5, a.getImaginary(), 0);
    }

    @Test
    public void add_twoParam_2() {
        ComplexNumber a = new ComplexNumber(3, 1);
        ComplexNumber b = new ComplexNumber(-1, 2);

        a.add(b.getReal(), b.getImaginary());
        assertEquals(2, a.getReal(), 0);
        assertEquals(3, a.getImaginary(), 0);
    }

    @Test
    public void add_oneParam_1() {
        ComplexNumber a = new ComplexNumber(5, 3);
        ComplexNumber b = new ComplexNumber(4, 2);

        a.add(b);
        assertEquals(9, a.getReal(), 0);
        assertEquals(5, a.getImaginary(), 0);
    }

    @Test
    public void add_oneParam_2() {
        ComplexNumber a = new ComplexNumber(3, 1);
        ComplexNumber b = new ComplexNumber(-1, 2);

        a.add(b);
        assertEquals(2, a.getReal(), 0);
        assertEquals(3, a.getImaginary(), 0);
    }

    @Test
    public void subtract_twoParam() {
        ComplexNumber a = new ComplexNumber(5, 3);
        ComplexNumber b = new ComplexNumber(4, 2);

        a.subtract(b.getReal(), b.getImaginary());
        assertEquals(1, a.getReal(), 0);
        assertEquals(1, a.getImaginary(), 0);
    }

    @Test
    public void subtract_oneParam() {
        ComplexNumber a = new ComplexNumber(5, 3);
        ComplexNumber b = new ComplexNumber(4, 2);

        a.subtract(b);
        assertEquals(1, a.getReal(), 0);
        assertEquals(1, a.getImaginary(), 0);
    }
}
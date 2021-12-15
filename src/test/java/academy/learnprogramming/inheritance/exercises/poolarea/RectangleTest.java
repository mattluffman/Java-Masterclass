package academy.learnprogramming.inheritance.exercises.poolarea;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 12/14/2021
 * Time: 11:54 PM
 */
public class RectangleTest {

    @Test
    public void widthNonNegative() {
        Rectangle rectangle = new Rectangle(-3, 5);
        assertEquals(0, rectangle.getWidth(), 0);
    }

    @Test
    public void getWidth() {
        Rectangle rectangle = new Rectangle(3, 5);
        assertEquals(3, rectangle.getWidth(), 0);
    }

    @Test
    public void lengthNonNegative() {
        Rectangle rectangle = new Rectangle(-3, -5);
        assertEquals(0, rectangle.getLength(), 0);
    }

    @Test
    public void getLength() {
        Rectangle rectangle = new Rectangle(3, 5);
        assertEquals(5, rectangle.getLength(), 0);
    }

    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(3, 5);
        assertEquals(15, rectangle.getArea(), 0);
    }
}
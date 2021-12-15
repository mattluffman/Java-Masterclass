package academy.learnprogramming.inheritance.exercises.cylinder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 12/14/2021
 * Time: 11:40 PM
 */
public class CircleTest {

    @Test
    public void constructor_setsRadius() {
        Circle circle = new Circle(27);
        assertEquals(27, circle.getRadius(), 0);
    }

    @Test
    public void constructor_setsRadius_nonNegative() {
        Circle circle = new Circle(-27);
        assertEquals(0, circle.getRadius(), 0);
    }

    @Test
    public void testArea() {
        Circle circle = new Circle(3.75);
        final double expected = 44.178646691106465;
        final double area = circle.getArea();
        System.out.println(area);
        assertEquals(expected, area, 0.0000000000000001);
    }
}
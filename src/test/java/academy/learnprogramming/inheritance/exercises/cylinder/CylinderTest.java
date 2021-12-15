package academy.learnprogramming.inheritance.exercises.cylinder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 12/14/2021
 * Time: 11:45 PM
 */
public class CylinderTest {

    @Test
    public void constructor_setsHeight() {
        Cylinder cylinder = new Cylinder(0, 27);
        assertEquals(27, cylinder.getHeight(), 0);
    }

    @Test
    public void constructor_setsHeight_nonNegative() {
        Cylinder cylinder = new Cylinder(0, -27);
        assertEquals(0, cylinder.getHeight(), 0);
    }

    @Test
    public void testArea() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        assertEquals(96.76890771219959, cylinder.getArea(), 0.0000000000000001);
    }

    @Test
    public void testVolume() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        final double volume = cylinder.getVolume();
        System.out.println(volume);
        assertEquals(701.574580913447, volume, 0.0000000000000001);
    }
}
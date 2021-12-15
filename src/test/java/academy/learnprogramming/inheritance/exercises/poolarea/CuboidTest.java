package academy.learnprogramming.inheritance.exercises.poolarea;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 12/15/2021
 * Time: 12:10 AM
 */
public class CuboidTest {

    @Test
    public void getHight() {
        Cuboid cuboid = new Cuboid(3, 5, 6);
        assertEquals(6, cuboid.getHeight(), 0);
    }

    @Test
    public void hightNonNegative() {
        Cuboid cuboid = new Cuboid(3, 5, -6);
        assertEquals(0, cuboid.getHeight(), 0);
    }

    @Test
    public void getVolume() {
        Cuboid cuboid = new Cuboid(3, 5, 6);
        assertEquals(90, cuboid.getVolume(), 0);
    }
}
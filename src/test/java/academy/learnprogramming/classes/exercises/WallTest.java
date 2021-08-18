package academy.learnprogramming.classes.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 8/17/2021
 * Time: 7:32 PM
 */
public class WallTest {

    @Test
    public void testConstructor_noNegativeValues() {
        Wall wall = new Wall(-15, -100);
        assertEquals(0, wall.getWidth(), 0);
        assertEquals(0, wall.getHeight(), 0);
    }

    @Test
    public void testConstructor_noArgs() {
        Wall wall = new Wall();
        assertEquals(0, wall.getWidth(), 0);
        assertEquals(0, wall.getHeight(), 0);
    }

    @Test
    public void testGetArea() {
        Wall wall = new Wall(26.12, 10);
        assertEquals(261.2, wall.getArea(), 0.0);
    }
}
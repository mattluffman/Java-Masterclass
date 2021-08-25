package academy.learnprogramming.classes.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 8/18/2021
 * Time: 12:05 AM
 * @see <a href="https://www.calculatorsoup.com/calculators/geometry-plane/distance-two-points.php">reference for calculations</a>
 */
public class PointTest {


    private static final Point SEVENTEEN_SIX = new Point(17, 6);
    private static final Point TWENTYFOUR_TWO = new Point(24, 2);

    // tests for constructors
    @Test
    public void test_noArgConstructor() {
        Point p = new Point();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }

    @Test
    public void test_allArgConstructor() {
        final int x = 17;
        final int y = 27;
        Point p = new Point(x, y);
        assertEquals(x, p.getX());
        assertEquals(y, p.getY());
    }

    /**
     * test distance with no parameters {@link Point#distance()}
     */
    @Test
    public void distance_noArgs() {
        final double expected = 18.027756;

        System.out.println(18.027756377319946 - 18.027756);
        assertEquals(expected, SEVENTEEN_SIX.distance(), 0.000001);
    }

    /**
     * test distance with one parameter {@link Point#distance(Point)}
     */
    @Test
    public void distance_oneArg() {
        Point p = new Point(-7, -4);
        final double expected = 31.575307;

        assertEquals(expected, p.distance(TWENTYFOUR_TWO), 0.000001);
    }

    /**
     * test distance with 2 args {@link Point#distance(int, int)}
     */
    @Test
    public void distance_twoArgs() {
        final double expected = 31.016125;

        assertEquals(expected, TWENTYFOUR_TWO.distance(13, -27), 0.000001);
    }
}
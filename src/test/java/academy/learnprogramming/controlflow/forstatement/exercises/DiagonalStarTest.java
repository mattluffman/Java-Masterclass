package academy.learnprogramming.controlflow.forstatement.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 6/8/2021
 * Time: 5:49 PM
 */
public class DiagonalStarTest {

    @Test
    public void test_invalid() {
        assertEquals("Invalid Value", DiagonalStar.createSquareStar(4));
    }

    @Test
    public void test5() {
        final String expected = "*****\n"
                                + "** **\n"
                                + "* * *\n"
                                + "** **\n"
                                + "*****";

        assertEquals(expected, DiagonalStar.createSquareStar(5));
    }

    @Test
    public void test8() {
        final String expected = "********\n"
                                + "**    **\n"
                                + "* *  * *\n"
                                + "*  **  *\n"
                                + "*  **  *\n"
                                + "* *  * *\n"
                                + "**    **\n"
                                + "********";

        assertEquals(expected, DiagonalStar.createSquareStar(8));
    }

    @Test
    public void test6() {
        final String expected = "******\n" +
                                "**  **\n" +
                                "* ** *\n" +
                                "* ** *\n" +
                                "**  **\n" +
                                "******";

        assertEquals(expected, DiagonalStar.createSquareStar(6));
    }
}
package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.FlourPacker.canPack;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Matt Luffman
 * Date: 5/28/2021
 * Time: 6:41 PM
 */
public class FlourPackerTest {

    @Test
    public void test1() {
        assertFalse(canPack(1, 0, 4));
    }

    @Test
    public void test2() {
        assertTrue(canPack(1, 0, 5));
    }

    @Test
    public void test3() {
        assertTrue(canPack(0, 5, 4));
    }

    @Test
    public void test4() {
        assertTrue(canPack(2, 2, 11));
    }

    @Test
    public void test5() {
        assertFalse(canPack(-3, 2, 12));
    }

    @Test
    public void test6() {
        assertTrue(canPack(14, 3, 12));
    }

    @Test
    public void test7() {
        assertFalse(canPack(14, 3, 14));
    }

    @Test
    public void test8() {
        assertTrue(canPack(14, 3, 13));
    }
}
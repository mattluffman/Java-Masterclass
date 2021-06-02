package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static academy.learnprogramming.controlflow.whiledowhile.exercises.FlourPacker.canPack;
import static org.junit.Assert.assertFalse;

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
}
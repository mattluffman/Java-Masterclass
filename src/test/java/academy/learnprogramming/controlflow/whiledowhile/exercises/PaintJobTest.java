package academy.learnprogramming.controlflow.whiledowhile.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 6/8/2021
 * Time: 5:52 PM
 */
public class PaintJobTest {

    @Test
    public void getBucketCount_fourParam_testInvalidInputs() {
        assertEquals("should have returned -1 for width of 0", -1, PaintJob.getBucketCount(0, 1, 1, 1));
        assertEquals("should have returned -1 for height of 0", -1, PaintJob.getBucketCount(1, 0, 1, 1));
        assertEquals("should have returned -1 for areaPerBucket of 0", -1, PaintJob.getBucketCount(1, 1, 0, 1));
        assertEquals("should have returned -1 for extraBucks of -1", -1, PaintJob.getBucketCount(1, 1, 1, -1));
    }

    @Test
    public void getBucketCount_fourParam_1() {
        assertEquals(3, PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
    }

    @Test
    public void getBucketCount_fourParam_2() {
        assertEquals(3, PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
    }

    @Test
    public void getBucketCount_threeParam_1() {
        assertEquals(5, PaintJob.getBucketCount(3.4, 2.1, 1.5));
    }

    @Test
    public void getBucketCount_threeParam_2() {
        assertEquals(14, PaintJob.getBucketCount(7.25, 4.3, 2.35));
    }

    @Test
    public void getBucketCount_twoParam_testInvalidInputs() {
        assertEquals("should have returned -1 for area of 0", -1, PaintJob.getBucketCount(0, 1));
        assertEquals("should have returned -1 for areaPerBucket of 0", -1, PaintJob.getBucketCount(1, 0));
    }

    @Test
    public void getBucketCount_twoParam_1() {
        assertEquals(3, PaintJob.getBucketCount(3.4, 1.5));
    }

    @Test
    public void getBucketCount_twoParam_2() {
        assertEquals(3, PaintJob.getBucketCount(6.26, 2.2));
    }

    @Test
    public void getBucketCount_twoParam_3() {
        assertEquals(5, PaintJob.getBucketCount(3.26, 0.75));
    }
}
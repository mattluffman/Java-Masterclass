package academy.learnprogramming.classes.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Matt Luffman
 * Date: 6/2/2021
 * Time: 3:23 PM
 */
public class PersonTest {

    Person p;

    @Before
    public void setup() {
        p = new Person();
    }

    @Test
    public void setAge_zeroIfOutOfBouns() {
        p.setAge(-23);
        assertEquals(0, p.getAge());

        p.setAge(101);
        assertEquals(0, p.getAge());
    }

    @Test
    public void setAge_worksForValidInput() {
        p.setAge(32);
        assertEquals(32, p.getAge());
    }

    @Test
    public void isTeen_false() {
        p.setAge(27);
        assertFalse(p.isTeen());
    }

    @Test
    public void isTeen_true() {
        p.setAge(16);
        assertTrue(p.isTeen());
    }

    @Test
    public void isEmpty_allowsNullPointer() {
        try {
            String val = p.getFullName();
            fail("this iteration of this code is allowed to throw null pointers");
        } catch (NullPointerException e) {
            System.err.println(e);
        }
    }

    @Test
    public void getFullName_returnsFull() {
        p.setFirstName("Matt");
        p.setLastName("Luffman");
        assertEquals("Matt Luffman", p.getFullName());
    }

    @Test
    public void getFullName_returnsLast() {
        p.setFirstName("");
        p.setLastName("Luffman");
        assertEquals("Luffman", p.getFullName());
    }

    @Test
    public void getFullName_returnsFirst() {
        p.setFirstName("Matt");
        p.setLastName("");
        assertEquals("Matt", p.getFullName());
    }

    @Test
    public void getFullName_returnsEmpty() {
        p.setFirstName("");
        p.setLastName("");
        assertEquals("", p.getFullName());
    }
}
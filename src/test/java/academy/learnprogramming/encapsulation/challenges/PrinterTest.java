package academy.learnprogramming.encapsulation.challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Matt Luffman
 * Date: 5/6/2022
 * Time: 6:18 PM
 */
public class PrinterTest {

    @Test
    public void addTonerMax100() {
        Printer printer = new Printer(false);
        assertEquals(100, printer.getTonerLevel());

        printer.addToner(1);
        assertEquals(100, printer.getTonerLevel());
    }

    @Test
    public void addToner() {
        Printer printer = new Printer(50, false);
        printer.addToner(10);
        assertEquals(60, printer.getTonerLevel());
    }

    @Test
    public void printingIncreasesTotalCount() {
        Printer printer = new Printer(50, false);
        printer.printPages(250);
        assertEquals(250, printer.getTotalPagesPrinted());
    }

    @Test
    public void printingDecreasesToner() {
        Printer printer = new Printer(50, false);
        printer.printPages(250);
        assertEquals(49, printer.getTonerLevel());
    }
}
package academy.learnprogramming.encapsulation.exercises;

/**
 * section 7, exercise 38
 *
 * @author Matt Luffman
 * Date: 5/6/2022
 * Time: 7:14 PM
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) {
            return -1;
        } else if (this.tonerLevel + tonerAmount > 100) {
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
        }
        return this.tonerLevel;
    }

    public int printPages(int number) {
        int pagesToPrint = number;
        if (this.duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (number / 2) + (number % 2);
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}

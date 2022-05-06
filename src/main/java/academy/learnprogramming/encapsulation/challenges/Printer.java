package academy.learnprogramming.encapsulation.challenges;

/**
 * section 7, lecture 94 challenge
 *
 * @author Matt Luffman
 * Date: 5/6/2022
 * Time: 6:11 PM
 */
public class Printer {

    private int tonerLevel;
    private int totalPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.totalPagesPrinted = 0;
    }

    public Printer(boolean duplex) {
        this.tonerLevel = 100;
        this.totalPagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getTotalPagesPrinted() {
        return totalPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void addToner(int amount) {
        if (this.tonerLevel + amount > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += amount;
        }
    }

    @Override
    public String toString() {
        return "Printer{" +
               "tonerLevel=" + tonerLevel +
               ", totalPagesPrinted=" + totalPagesPrinted +
               ", duplex=" + duplex +
               '}';
    }

    public void printPages(int number) {
        if (number > 0 && this.tonerLevel > 0) {
            System.out.println("Printing " + number + " pages.");
            this.totalPagesPrinted += number;
            // for simplicity sake,just decrease toner by one
            this.tonerLevel -= 1;
        }
    }
}

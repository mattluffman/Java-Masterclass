package academy.learnprogramming.inheritance.challenges;

/**
 * section 6, lecture 88
 *
 * @author Matt Luffman
 * Date: 11/24/2021
 * Time: 5:49 PM
 */
public class Convertible extends Car {

    boolean roofOpen;

    public Convertible() {
        this(6, false);
    }

    public Convertible(int gears, boolean roofOpen) {
        super(gears);
        this.roofOpen = roofOpen;
    }

    public void openRoof() {
        if (this.roofOpen) {
            System.out.println("Roof is already open");
        } else {
            System.out.println("Opening roof");
            this.roofOpen = true;
        }
    }

    public void closeRoof() {
        if (!this.roofOpen) {
            System.out.println("Roof is already closed");
        } else {
            System.out.println("Closing roof");
            this.roofOpen = false;
        }
    }
}

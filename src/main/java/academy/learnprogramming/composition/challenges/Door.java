package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 5/2/2022
 * Time: 11:04 PM
 */
public class Door {

    private boolean open;

    public Door() {
        this.open = false;
        System.out.println("Door created with the following properties: open=false");
    }

    public void open() {
        if (!this.open) {
            this.open = true;
            System.out.println("Opening the door");
        }
    }

    public void close() {
        if (this.open) {
            this.open = false;
            System.out.println("Closing the door");
        }
    }
}

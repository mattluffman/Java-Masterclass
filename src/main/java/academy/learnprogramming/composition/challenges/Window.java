package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 5/2/2022
 * Time: 11:05 PM
 */
public class Window {

    private boolean open;

    public Window() {
        this.open = false;
        System.out.println("Window created with the following properties: open=false");
    }

    public void open() {
        if (!this.open) {
            this.open = true;
            System.out.println("Opening the window");
        }
    }

    public void close() {
        if (this.open) {
            this.open = false;
            System.out.println("Closing the window");
        }
    }
}

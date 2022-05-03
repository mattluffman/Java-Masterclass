package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 5/2/2022
 * Time: 10:50 PM
 */
public class Lamp {

    boolean on;

    public Lamp() {
        this.on = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Lamp created with the following properties: " +
               "on=" + on;
    }

    public void turnOn() {
        if (!this.on) {
            this.on = true;
            System.out.println("Turning on the lamp");
        }
    }

    public void turnOff() {
        if (this.on) {
            this.on = false;
            System.out.println("Turning off the lamp");
        }
    }
}

package academy.learnprogramming.composition.exercises;

/**
 * section 7, exercise 38
 *
 * @author Matt Luffman
 * Date: 5/3/2022
 * Time: 12:00 AM
 */
public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is turned on");
    }
}

package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 4/29/2022
 * Time: 6:15 PM
 */
public class TV {

    int size;
    String brand;
    String type;
    boolean on;

    public TV(int size, String brand, String type) {
        this.size = size;
        this.brand = brand;
        this.type = type;
        this.on = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "TV created with the following properties: " +
               "size=" + size +
               ", brand='" + brand + '\'' +
               ", type='" + type + '\'';
    }

    public void turnOn() {
        if (!this.on) {
            this.on = true;
            System.out.println("Turning on the TV");
        }
    }

    public void turnOff() {
        if (this.on) {
            this.on = false;
            System.out.println("Turning off the TV");
        }
    }
}

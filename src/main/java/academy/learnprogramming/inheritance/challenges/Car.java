package academy.learnprogramming.inheritance.challenges;

/**
 * section 6, lecture 88
 *
 * @author Matt Luffman
 * Date: 11/24/2021
 * Time: 5:48 PM
 */
public class Car extends Vehicle {

    public int gears;
    public int currentGear;

    public Car(int gears) {
        super();
        this.gears = gears;
        this.currentGear = 1;
    }

    public void upShift() {
        if (this.currentGear < this.gears) {
            this.currentGear++;
            System.out.println("shifting up to gear " + this.currentGear);
        }
    }

    public void downShift() {
        if (this.currentGear > 1) {
            this.currentGear--;
            System.out.println("shifting down to gear " + this.currentGear);
        }
    }
}

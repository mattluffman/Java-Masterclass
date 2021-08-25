package academy.learnprogramming.classes.exercises.carpetcostcalculator;

/**
 * section 6, exercise 33
 *
 * @author Matt Luffman
 * Date: 8/19/2021
 * Time: 6:05 AM
 */
public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width > 0 ? width : 0;
        this.length = length > 0 ? length : 0;
    }

    public double getArea() {
        return this.width * this.length;
    }
}

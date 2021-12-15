package academy.learnprogramming.inheritance.exercises.cylinder;

/**
 * section 6, exercise 35
 *
 * @author Matt Luffman
 * Date: 12/14/2021
 * Time: 11:42 PM
 */
public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * this.getHeight();
    }
}

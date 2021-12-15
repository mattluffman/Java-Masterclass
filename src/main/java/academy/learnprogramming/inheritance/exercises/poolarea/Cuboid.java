package academy.learnprogramming.inheritance.exercises.poolarea;

/**
 * section 6, exercise 36
 *
 * @author Matt Luffman
 * Date: 12/14/2021
 * Time: 11:51 PM
 */
public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * this.getHeight();
    }
}

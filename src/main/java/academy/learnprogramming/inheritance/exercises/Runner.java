package academy.learnprogramming.inheritance.exercises;

import academy.learnprogramming.inheritance.exercises.cylinder.Circle;
import academy.learnprogramming.inheritance.exercises.cylinder.Cylinder;
import academy.learnprogramming.inheritance.exercises.poolarea.Cuboid;
import academy.learnprogramming.inheritance.exercises.poolarea.Rectangle;

/**
 * @author Matt Luffman
 * Date: 12/14/2021
 * Time: 11:47 PM
 */
public class Runner {

    public static void main(String[] args) {
        runCylinder();
        System.out.println();
        runPoolArea();
    }

    private static void runPoolArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

    private static void runCylinder() {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}

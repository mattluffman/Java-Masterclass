package academy.learnprogramming.inheritance.exercises;

import academy.learnprogramming.inheritance.exercises.cylinder.Circle;
import academy.learnprogramming.inheritance.exercises.cylinder.Cylinder;

/**
 * @author Matt Luffman
 * Date: 12/14/2021
 * Time: 11:47 PM
 */
public class Runner {

    public static void main(String[] args) {
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

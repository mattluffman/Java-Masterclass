package academy.learnprogramming.inheritance;

/**
 * Section 6 - lecture 82 on inheritance - part 2
 *
 * @author Matt Luffman
 * Date: 11/3/2021
 * Time: 6:32 PM
 */
public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    public void swim(int speed) {
        System.out.println("Fish.swim() called.");
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    private void moveMuscles() {
        System.out.println("Fish.moveMuscles() called.");
    }

    private void moveBackFin() {
        System.out.println("Fish.moveBackFin() called.");
    }
}

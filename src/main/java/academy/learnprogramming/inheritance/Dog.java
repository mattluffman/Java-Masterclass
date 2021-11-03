package academy.learnprogramming.inheritance;

/**
 * section 6, lecture 81 on Inheritance
 *
 * @author Matt Luffman
 * Date: 8/31/2021
 * Time: 6:35 PM
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5); // better to not use super in case you add another class in the hierarchy
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10); // better to not use super in case you add another class in the hierarchy
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
}

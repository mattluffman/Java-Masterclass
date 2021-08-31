package academy.learnprogramming.inheritance;

/**
 * section 6, lecture 81 on Inheritance
 *
 * @author Matt Luffman
 * Date: 8/31/2021
 * Time: 6:31 PM
 */
public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //<editor-fold desc="Getters">
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
    //</editor-fold>

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move() {

    }
}

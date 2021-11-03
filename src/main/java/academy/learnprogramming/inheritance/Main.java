package academy.learnprogramming.inheritance;

/**
 * @author Matt Luffman
 * Date: 8/31/2021
 * Time: 6:34 PM
 */
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Bass", 4, 20, 4, 2, 3);
        fish.swim(3);
    }
}

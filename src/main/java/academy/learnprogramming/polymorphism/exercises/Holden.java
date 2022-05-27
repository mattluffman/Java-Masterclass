package academy.learnprogramming.polymorphism.exercises;

/**
 * @author Matt Luffman
 * Date: 5/27/2022
 * Time: 5:31 PM
 */
public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " -> brake()";
    }
}

package academy.learnprogramming.classes.exercises.carpetcostcalculator;

/**
 * section 6, exercise 33
 *
 * @author Matt Luffman
 * Date: 8/19/2021
 * Time: 6:05 AM
 */
public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = cost >= 0 ? cost : 0;
    }

    public double getCost() {
        return cost;
    }
}

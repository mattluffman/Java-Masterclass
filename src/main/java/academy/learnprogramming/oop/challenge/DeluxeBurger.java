package academy.learnprogramming.oop.challenge;

/**
 * section 7, lecture 97 challenge
 *
 * @author Matt Luffman
 * Date: 6/6/2022
 * Time: 9:48 PM
 */
public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String breadType, String meat, double price) {
        super(breadType, meat, price);
        super.addAddition(new Addition("Coke", 2.35));
        super.addAddition(new Addition("Chips", 1.25));
    }

    @Override
    public boolean addAddition(Addition addition) {
        System.out.println("Additions are not allowed on Deluxe Burger other than the given Drink & Chips");
        return false;
    }
}

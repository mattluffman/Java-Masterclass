package academy.learnprogramming.oop.challenge;

/**
 * section 7, lecture 97 challenge
 *
 * @author Matt Luffman
 * Date: 6/6/2022
 * Time: 7:37 PM
 */
public class Addition {

    private String name;
    private double price;

    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Addition name: %s, price: %s", this.name, this.price);
    }
}

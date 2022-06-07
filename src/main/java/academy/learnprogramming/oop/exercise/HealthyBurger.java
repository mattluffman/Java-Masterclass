package academy.learnprogramming.oop.exercise;

/**
 * section 7, exercise 40
 *
 * @author Matt Luffman
 * Date: 6/6/2022
 * Time: 10:11 PM
 */
public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.printf("Added %s for an extra %s%n", name, price);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.printf("Added %s for an extra %s%n", name, price);
    }

    @Override
    public double itemizeHamburger() {
        double fullPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            fullPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            fullPrice += this.healthyExtra2Price;
        }
        return fullPrice;
    }
}

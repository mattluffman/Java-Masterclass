package academy.learnprogramming.oop.exercise;

/**
 * section 7, exercise 40
 *
 * @author Matt Luffman
 * Date: 6/6/2022
 * Time: 10:11 PM
 */
public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.printf("%s hamburger on a %s roll with %s, price is %s\n", this.name, this.breadRollType, this.meat, this.price);
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.printf("Added %s for an extra %s%n", name, price);
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.printf("Added %s for an extra %s%n", name, price);
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.printf("Added %s for an extra %s%n", name, price);
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.printf("Added %s for an extra %s%n", name, price);
    }

    public double itemizeHamburger() {
        double fullPrice = this.price;
        if (this.addition1Name != null) {
            fullPrice += this.addition1Price;
        }
        if (this.addition2Name != null) {
            fullPrice += this.addition2Price;
        }
        if (this.addition3Name != null) {
            fullPrice += this.addition3Price;
        }
        if (this.addition4Name != null) {
            fullPrice += this.addition4Price;
        }
        return fullPrice;
    }
}

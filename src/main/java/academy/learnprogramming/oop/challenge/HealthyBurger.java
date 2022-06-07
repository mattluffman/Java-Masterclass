package academy.learnprogramming.oop.challenge;

/**
 * section 7, lecture 97
 *
 * @author Matt Luffman
 * Date: 6/6/2022
 * Time: 9:06 PM
 */
public class HealthyBurger extends Hamburger {

    private Addition addition5;
    private Addition addition6;

    public HealthyBurger(String meat, double price) {
        super("brown rye bread roll", meat, price);
    }

    @Override
    public boolean addAddition(Addition addition) {
        boolean additionAdded = false;
        if (this.getCurrentAdditions() < BASE_ALLOWED_ADDITIONS) {
            additionAdded = super.addAddition(addition);
        } else if (this.addition5 == null || this.addition6 == null) {
            if (this.addition5 == null) {
                this.addition5 = addition;
            } else {
                this.addition6 = addition;
            }
            additionAdded = true;
        }
        return additionAdded;
    }

    @Override
    public double getFullPrice() {
        double fullPrice = super.getFullPrice();
        if (this.addition5 != null) {
            fullPrice += this.addition5.getPrice();
        }
        if (this.addition6 != null) {
            fullPrice += this.addition6.getPrice();
        }
        return fullPrice;
    }

    @Override
    public void printFullPrice() {
        if (this.getName() != null) {
            System.out.println(this.getName() + " base price: " + this.getPrice());
        } else {
            System.out.println("Burger base price: " + this.getPrice());
        }

        // print & add prices for all additionals
        if (this.getAddition1() != null) {
            System.out.println(this.getAddition1());
        }
        if (this.getAddition2() != null) {
            System.out.println(this.getAddition2());
        }
        if (this.getAddition3() != null) {
            System.out.println(this.getAddition3());
        }
        if (this.getAddition4() != null) {
            System.out.println(this.getAddition4());
        }
        if (this.addition5 != null) {
            System.out.println(this.addition5);
        }
        if (this.addition6 != null) {
            System.out.println(this.addition6);
        }

        System.out.println("Full burger price: " + this.getFullPrice());
    }
}

package academy.learnprogramming.oop.challenge;

/**
 * @author Matt Luffman
 * Date: 6/6/2022
 * Time: 7:37 PM
 */
public class Hamburger {

    public static final int BASE_ALLOWED_ADDITIONS = 4;

    private String breadType;
    private String meat;
    private double price;
    private String name;
    private int currentAdditions = 0;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    public Hamburger(String breadType, String meat, double price) {
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    //<editor-fold desc="Getters/Setters">
    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentAdditions() {
        return currentAdditions;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }
    //</editor-fold>

    /**
     * adds an addition to the burger if there is room left
     *
     * @param addition the {@link Addition} you want to add to the burger
     * @return true if added successfully, false otherwise if there are already the allowed amount
     */
    public boolean addAddition(Addition addition) {
        boolean additionAdded = false;
        if (this.currentAdditions < BASE_ALLOWED_ADDITIONS) {
            switch (currentAdditions) {
                case 0:
                    addition1 = addition;
                    break;
                case 1:
                    addition2 = addition;
                    break;
                case 2:
                    addition3 = addition;
                    break;
                case 3:
                    addition4 = addition;
                    break;
            }
            // add addition to this spot
            this.currentAdditions++;
            additionAdded = true;
        }
        return additionAdded;
    }

    public double getFullPrice() {
        double fullPrice = this.getPrice();

        // add prices for all additionals
        if (this.getAddition1() != null) {
            fullPrice += this.getAddition1().getPrice();
        }
        if (this.getAddition2() != null) {
            fullPrice += this.getAddition2().getPrice();
        }
        if (this.getAddition3() != null) {
            fullPrice += this.getAddition3().getPrice();
        }
        if (this.getAddition4() != null) {
            fullPrice += this.getAddition4().getPrice();
        }

        return fullPrice;
    }

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

        System.out.println("Full burger price: " + this.getFullPrice());
    }
}

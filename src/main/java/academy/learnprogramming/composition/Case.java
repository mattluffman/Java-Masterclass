package academy.learnprogramming.composition;

/**
 * section 7, lecture 91
 *
 * @author Matt Luffman
 * Date: 2/25/2022
 * Time: 5:45 PM
 */
public class Case {

    private final String model;
    private final String manufacturer;
    private final String powerSupply;
    private final Dimesions dimesions;

    public Case(String model, String manufacturer, String powerSupply, Dimesions dimesions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimesions = dimesions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimesions getDimesions() {
        return dimesions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}

package academy.learnprogramming.classes;

/**
 * section 6, lecture 77
 *
 * @author Matt Luffman
 * Date: 5/18/2021
 * Time: 12:42 AM
 */
public class Car {

    // state of the car = fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // setter, standard methods
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // getter
    public String getModel() {
        return this.model;
    }
}

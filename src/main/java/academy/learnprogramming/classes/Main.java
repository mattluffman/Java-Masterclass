package academy.learnprogramming.classes;

/**
 * @author Matt Luffman
 * Date: 5/18/2021
 * Time: 12:50 AM
 */
public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        // System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}

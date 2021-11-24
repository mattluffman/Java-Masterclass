package academy.learnprogramming.inheritance.challenges;

/**
 * section 6, lecture 88
 *
 * @author Matt Luffman
 * Date: 11/24/2021
 * Time: 6:53 PM
 */
public class VehicleRunner {

    public static void main(String[] args) {
        Vehicle skateboard = new Vehicle();
        skateboard.setSpeed(25);
        System.out.println("is skateboard moving: " + skateboard.isMoving());
        skateboard.turnLeft();

        System.out.println();

        Car impreza = new Car(6);
        System.out.println("is impreza moving: " + impreza.isMoving());
        impreza.setSpeed(30);
        System.out.println("is impreza moving: " + impreza.isMoving());
        impreza.upShift();
        impreza.downShift();
        impreza.turnRight();
        impreza.stop();

        System.out.println();

        Convertible cabriolet = new Convertible(5, true);
        cabriolet.setSpeed(20);
        cabriolet.upShift();
        cabriolet.upShift();
        cabriolet.upShift();
        cabriolet.turnRight();
        cabriolet.openRoof();
        cabriolet.closeRoof();
        cabriolet.stop();
    }
}

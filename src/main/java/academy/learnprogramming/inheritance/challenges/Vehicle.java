package academy.learnprogramming.inheritance.challenges;

/**
 * section 6, lecture 88
 *
 * @author Matt Luffman
 * Date: 11/24/2021
 * Time: 5:47 PM
 */
public class Vehicle {

    private int speed;

    public Vehicle() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        System.out.println("Setting vehicle speed to " + speed);
        this.speed = speed;
    }

    public boolean isMoving() {
        return this.speed > 0;
    }

    public void stop() {
        System.out.println("Stopping the vehicle");
        setSpeed(0);
    }

    public void turnRight() {
        System.out.println("Turning right");
    }

    public void turnLeft() {
        System.out.println("Turning left");
    }
}

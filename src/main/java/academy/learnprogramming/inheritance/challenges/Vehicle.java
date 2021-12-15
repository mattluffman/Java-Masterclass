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
    private Direction direction;

    public Vehicle() {
        this.speed = 0;
        this.direction = Direction.STRAIGHT;
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
        this.steer(Direction.RIGHT);
    }

    public void turnLeft() {
        System.out.println("Turning left");
        this.steer(Direction.LEFT);
    }

    public void steer(Direction direction) {
        this.direction = direction;
    }

    public void move(int speed, Direction direction) {
        this.setSpeed(speed);
        this.steer(direction);
    }
}

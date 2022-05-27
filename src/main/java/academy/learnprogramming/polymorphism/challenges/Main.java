package academy.learnprogramming.polymorphism.challenges;


/**
 * section 7, lecture 96 - car challenge
 *
 * @author Matt Luffman
 * Date: 5/26/22
 * Time: 6:25 PM
 */
class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Starting the " + this.name + " engine");
    }

    public void accelerate() {
        System.out.println(this.name + " is accelerating");
    }

    public void brake() {
        System.out.println(this.name + " is braking");
    }
}

class F150Tremor extends Car {

    public F150Tremor() {
        super("Ford F150 Tremor", 6);
    }

    @Override
    public void startEngine() {
        System.out.println(this.getName() + " would be starting, but the engine isn't built yet");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getName() + " would be accelerating, but it's doesn't exist yet");
    }

    @Override
    public void brake() {
        System.out.println(this.getName() + " would be braking, but it doesn't exist yet");
    }
}

class F150FX4 extends Car {

    public F150FX4() {
        super("Ford F150 FX4", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford F150 FX4 engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford F150 FX4 is accelerating quickly, turbos are spinning");
    }

    @Override
    public void brake() {
        System.out.println("Ford F150 FX4 is braking, & the brakes are making noise");
    }
}

class HondaAccord extends Car {

    public HondaAccord() {
        super("Honda Accord", 4);
    }

    @Override
    public void accelerate() {
        System.out.println(this.getName() + " is accelerating, but slowly");
    }
}

public class Main {

    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generice car calss.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.printf("Car #%s : %s, engine: %s, cylinders: %s, wheels: %s %n", i, car.getName(), car.isEngine(), car.getCylinders(), car.getWheels());
            car.startEngine();
            car.accelerate();
            car.brake();
            System.out.println();
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new F150Tremor();
            case 2:
                return new F150FX4();
            case 3:
                return new HondaAccord();
            default:
                return null;
        }
    }
}

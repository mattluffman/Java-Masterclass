package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 4/29/2022
 * Time: 5:24 PM
 */
public class Room {

    private Floor floor;
    private Ceiling ceiling;
    private Wall[] walls;
    private TV tv;
    private Bed bed;
    private Lamp lamp;
    private Window window;
    private Door door;

    public Room(int length, int width, int height, FloorType floorType, String paint, TV tv, Bed bed) {
        this.floor = new Floor(length, width, floorType);
        this.ceiling = new Ceiling(length, width);
        this.lamp = new Lamp();
        this.window = new Window();
        this.door = new Door();

        // create walls
        this.walls = new Wall[4];
        this.walls[0] = new Wall(length, height, paint);
        this.walls[1] = new Wall(length, height, paint);
        this.walls[2] = new Wall(width, height, paint);
        this.walls[3] = new Wall(width, height, paint);

        this.tv = tv;
        this.bed = bed;

    }

    public TV getTv() {
        return tv;
    }

    /**
     * turn off lamp, make bed, close window, close door, turn off tv
     */
    public void leaveHome() {
        this.lamp.turnOff();
        this.bed.makeBed();
        this.tv.turnOff();
        this.window.close();
        this.door.close();
        System.out.println("You cats behave while I'm gone!!!");
    }

    public void getInBed() {
        this.bed.pullDownSheets();
        System.out.println("Laying in the bed");
    }

    public void enterRoomAndOpenWindow() {
        this.door.open();
        this.window.open();
    }

    public void illuminate() {
        this.lamp.turnOn();
    }
}

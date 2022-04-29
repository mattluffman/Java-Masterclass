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

    public Room(int length, int width, int height, FloorType floorType, String paint, TV tv, Bed bed) {
        this.floor = new Floor(length, width, floorType);
        this.ceiling = new Ceiling(length, width);

        // create walls
        this.walls = new Wall[4];
        this.walls[0] = new Wall(length, height, paint);
        this.walls[1] = new Wall(length, height, paint);
        this.walls[2] = new Wall(width, height, paint);
        this.walls[3] = new Wall(width, height, paint);

        this.tv = tv;
        this.bed = bed;
    }
}

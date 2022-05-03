package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 2/25/2022
 * Time: 6:12 PM
 */
public class Main {

    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well

    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video

    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class
    // like you saw in this video.

    /*
    door, window, desk,
    lamp,
    bed,
    tv,
    wall,
    ceiling,
    floor
     */

    /*
    plans: have one of the furniture items have a getter in room, & the others not
    that one will have a getter where you can call it's methods = I'm thinking lamp for this one, it will have a turnOn & turnOff methods
    bed will have MakeBed method, leave room method, turn off lamp & make bed, close window
    others will have no getter & a wrapper type method in the room class (like drawLogo())
     */

    public static void main(String[] args) {

        TV tv = new TV(65, "Sony", "OLED");
        Bed bed = new Bed("Queen");
        Room room = new Room(10, 12, 10, FloorType.HARDWOOD, "light green", tv, bed);

        // turn on tv, requirement 1 for using getter
        room.getTv().turnOn();

        room.enterRoomAndOpenWindow();
        room.illuminate();

        // get in the bed (unmake it), requirement 2 for hiding the functionality & using a method
        room.getInBed();

        // leaving the house
        System.out.println();
        room.leaveHome();
    }
}

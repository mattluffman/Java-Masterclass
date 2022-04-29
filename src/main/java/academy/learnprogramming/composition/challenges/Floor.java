package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 4/29/2022
 * Time: 5:44 PM
 */
public class Floor {

    private int length;
    private int width;
    private FloorType type;

    public Floor(int length, int width, FloorType type) {
        this.length = length;
        this.width = width;
        this.type = type;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Floor created with teh following properties: " +
               "length=" + length +
               ", width=" + width +
               ", type=" + type;
    }
}

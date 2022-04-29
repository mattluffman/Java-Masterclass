package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 4/29/2022
 * Time: 6:03 PM
 */
public class Wall {

    private int length;
    private int height;
    private String color;

    public Wall(int length, int height, String color) {
        this.length = length;
        this.height = height;
        this.color = color;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Wall created with the following properties: " +
               "length=" + length +
               ", height=" + height +
               ", color='" + color + '\'';
    }
}

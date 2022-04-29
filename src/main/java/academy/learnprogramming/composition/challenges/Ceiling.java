package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 4/29/2022
 * Time: 5:56 PM
 */
public class Ceiling {

    private int length;
    private int width;

    public Ceiling(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Ceiling created with the following properties: " +
               "length=" + length +
               ", width=" + width;
    }
}

package academy.learnprogramming.composition;

/**
 * section 7, lecture 91
 *
 * @author Matt Luffman
 * Date: 2/25/2022
 * Time: 5:43 PM
 */
public class Resolution {

    private final int width;
    private final int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

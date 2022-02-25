package academy.learnprogramming.composition;

/**
 * section 7, lecture 91
 *
 * @author Matt Luffman
 * Date: 2/25/2022
 * Time: 5:46 PM
 */
public class Dimesions {

    private final int width;
    private final int height;
    private final int depth;

    public Dimesions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

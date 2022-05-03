package academy.learnprogramming.composition.exercises;

/**
 * section 7, exercise 37
 *
 * @author Matt Luffman
 * Date: 5/3/2022
 * Time: 6:27 PM
 */
public class Ceiling {

    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}

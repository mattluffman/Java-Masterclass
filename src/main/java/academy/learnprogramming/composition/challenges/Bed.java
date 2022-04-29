package academy.learnprogramming.composition.challenges;

/**
 * section 7, lecture 92 - challenge
 *
 * @author Matt Luffman
 * Date: 4/29/2022
 * Time: 6:18 PM
 */
public class Bed {

    String size;
    boolean made;

    public Bed(String size) {
        this.size = size;
        this.made = true;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Bed created with the following properties: " +
               "size='" + size + '\'' +
               ", made=" + made;
    }
}

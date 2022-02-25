package academy.learnprogramming.composition;

/**
 * section 7, lecture 91
 *
 * @author Matt Luffman
 * Date: 2/25/2022
 * Time: 5:50 PM
 */
public class Main {

    public static void main(String[] args) {
        Dimesions dimesions = new Dimesions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimesions);

        // first time the instructor demonstrates that you can create an object without a variable :-P
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUp();
    }
}

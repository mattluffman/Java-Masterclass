package academy.learnprogramming.controlflow.switchstatement.exercises;

/**
 * section 5, exercise 12
 *
 * @author Matt Luffman
 * Date: 4/28/2021
 * Time: 5:32 PM
 */
public class NumberInWord {

    /**
     * Write a method called printNumberInWord.
     * The method has one parameter number which is the whole number.
     * The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers.
     * You can use if-else statement or switch statement whatever is easier for you.
     *
     *
     * NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
     *
     * NOTE: Do not add main method to solution code.
     */
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }
}

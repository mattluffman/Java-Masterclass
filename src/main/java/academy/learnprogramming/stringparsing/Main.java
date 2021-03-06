package academy.learnprogramming.stringparsing;

/**
 * section 5, lecture 71
 *
 * @author Matt Luffman
 * Date: 5/13/2021
 * Time: 7:40 PM
 */
public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);
        // int number = Integer.parseInt(numberAsString); // wrapper class for primitive
        double number = Double.parseDouble(numberAsString); // wrapper class for primitive
        System.out.println("number = " + number);

        numberAsString += 1; // concatenation
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}

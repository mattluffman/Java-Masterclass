package academy.learnprogramming.userinput.challenges;

import java.util.Scanner;

/**
 * section 5, lecture 75 - min &max input challenge
 *
 * @author Matt Luffman
 * Date: 5/17/2021
 * Time: 10:26 PM
 */
public class MinAndMaxInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // boolean firstIteration = true;
        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                /*if (firstIteration) {
                    min = number;
                    max = number;
                    firstIteration = false;
                }*/

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }

        System.out.println("Your min number was " + min + " and your max was " + max);
        // close scanner
        scanner.close();
    }
}

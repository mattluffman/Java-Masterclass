package academy.learnprogramming.userinput;

import java.util.Scanner;

/**
 * section 5, lecture 72 on reading user input
 *
 * @author Matt Luffman
 * Date: 5/17/2021
 * Time: 9:25 PM
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // calculate age
        int age = 2021 - yearOfBirth;

        if (age >= 0 && age <= 100) {
            System.out.println("Your name is " + name + ", and you are " + age + " years old");
        } else {
            System.out.println("Invalid year of birth");
        }

        // close for no future input, free up resources
        scanner.close();
    }
}

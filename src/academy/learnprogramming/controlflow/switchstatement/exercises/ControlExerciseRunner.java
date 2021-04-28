package academy.learnprogramming.controlflow.switchstatement.exercises;

import static academy.learnprogramming.controlflow.switchstatement.exercises.NumberInWord.printNumberInWord;

/**
 * Main method for exercises for switch statements
 *
 * @author Matt Luffman
 * Date: 4/28/2021
 * Time: 5:35 PM
 */
public class ControlExerciseRunner {

    public static void main(String[] args) {
        testNumberInWord();
    }

    private static void testNumberInWord() {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
        printNumberInWord(-23);
    }
}

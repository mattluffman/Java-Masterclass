package academy.learnprogramming.controlflow.switchstatement.exercises;

import static academy.learnprogramming.controlflow.switchstatement.exercises.NumberInWord.printNumberInWord;
import static academy.learnprogramming.controlflow.switchstatement.exercises.NumberOfDaysInMonth.getDaysInMonth;
import static academy.learnprogramming.controlflow.switchstatement.exercises.NumberOfDaysInMonth.isLeapYear;
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
        testNumberOfDaysInMonth();
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

    private static void testNumberOfDaysInMonth() {
        assert !isLeapYear(1);
        assert !isLeapYear(-1600);
        assert isLeapYear(1600);
        assert !isLeapYear(2017);
        assert isLeapYear(2000);

        assert getDaysInMonth(1, -1) == -1;
        assert getDaysInMonth(-1, 1) == -1;
        assert getDaysInMonth(2, 2020) == 29;
        assert getDaysInMonth(2, 2021) == 28;
        assert getDaysInMonth(3, 12) == 31;
        assert getDaysInMonth(5, 12) == 31;
        assert getDaysInMonth(7, 12) == 31;
        assert getDaysInMonth(8, 12) == 31;
        assert getDaysInMonth(10, 12) == 31;
        assert getDaysInMonth(12, 12) == 31;
        assert getDaysInMonth(4, 12) == 30;
        assert getDaysInMonth(6, 12) == 30;
        assert getDaysInMonth(9, 12) == 30;
        assert getDaysInMonth(11, 12) == 30;
    }
}

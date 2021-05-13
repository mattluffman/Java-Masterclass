package academy.learnprogramming.controlflow.whiledowhile;

/**
 * section 5, lecture 68-69
 *
 * @author Matt Luffman
 * Date: 5/13/2021
 * Time: 5:00 PM
 */
public class WhileLoop {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // for equiv
        for (count = 1; count < 6; count++) {
            System.out.println("Count value is " + count);
        }

        // another way
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // do while has the advantage of always executing at least once
        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);

        // Challenge 1
        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;  // everything after this is skipped
            }

            System.out.println("Even number " + number);
            evenNumbers++;

            if (evenNumbers == 5) {
                break;
            }
        }

        // challenge 2, modify the above to count number of even #s, & break at 5. Display # at end
        System.out.println("Number of even numbers: " + evenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

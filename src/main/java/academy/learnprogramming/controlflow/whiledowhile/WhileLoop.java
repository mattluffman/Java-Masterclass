package academy.learnprogramming.controlflow.whiledowhile;

/**
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
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;  // everything after this is skipped
            }

            System.out.println("Even number " + number);
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

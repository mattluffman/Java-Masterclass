package academy.learnprogramming.controlflow.forstatement.exercises;

/**
 * section 5, exercise 26
 *
 * @author Matt Luffman
 * Date: 6/8/2021
 * Time: 5:47 PM
 */
public class DiagonalStar {

    /**
     * Write a method named printSquareStar with one parameter of type int named number.
     *
     * If number is < 5, the method should print "Invalid Value".
     *
     * The method should print diagonals to generate a rectangular pattern composed of stars (*).
     * This should be accomplished by using loops (see examples below).
     *
     *
     * EXAMPLE INPUT/OUTPUT:
     *
     * EXAMPLE 1
     *
     * printSquareStar(5); should print the following:
     *
     * → NOTE: For text in Code Blocks below, use code icon {...}  on Udemy
     *
     * *****
     * ** **
     * * * *
     * ** **
     * *****
     *
     *
     * Explanation:
     *
     * *****   5 stars
     * ** **   2 stars space 2 stars
     * * * *   1 star space 1 star space 1 star
     * ** **   2 stars space 2 stars
     * *****   5 stars
     *
     *
     * EXAMPLE 2
     *
     * printSquareStar(8); should print the following:
     *
     * ********
     * **    **
     * * *  * *
     * *  **  *
     * *  **  *
     * * *  * *
     * **    **
     * ********
     *
     *
     * The patterns above consist of a number of rows and columns (where number is the number of rows to print).
     * For each row or column, stars are printed based on four conditions (Read them carefully):
     *
     * * In the first or last row
     * * In the first or last column
     * * When the row number equals the column number
     * * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
     *
     *
     * HINT: Use a nested loop (a loop inside of a loop).
     * HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" ");
     * prints a space and does not "move" to another line.
     * HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .
     * NOTE: The method printSquareStar should be defined as public static like we have been doing so far in the course.
     * NOTE: Do not add a main method to the solution code.
     */
    public static void printSquareStar(int number) {
        String result;
        if (number < 5) {
            result = "Invalid Value";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int row = 0; row < number; row++) {
                for (int column = 0; column < number; column++) {
                    if (row == 0 || row == number - 1 ||       // In the first or last row
                        column == 0 || column == number - 1 || // In the first or last column
                        row == column ||                       // When the row number equals the column number
                        column + 1 == (number - row)       // When the column number equals rowCount - currentRow + 1
                    ) {
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }

                // add line end except when we're done
                if (row != number - 1) {
                    sb.append("\n");
                }
            }
            result = sb.toString();
        }

        final String star = result;
        System.out.println(star);
    }
}

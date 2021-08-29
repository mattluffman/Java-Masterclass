package academy.learnprogramming.controlflow.forstatement.exercises;

import static academy.learnprogramming.controlflow.forstatement.exercises.SumOddRange.sumOdd;

/**
 * @author Matt Luffman
 * Date: 5/6/2021
 * Time: 6:14 PM
 */
public class ForExerciseRunner {

    public static void main(String[] args) {
        testSumOddRange();
        testDiagonalStar();
    }

    private static void testSumOddRange() {
        assert sumOdd(1, 100) == 2500; // should return 2500
        assert sumOdd(-1, 100) == -1; // should return -1
        assert sumOdd(100, 100) == 0; // should return 0
        assert sumOdd(13, 13) == 13; // should return 13 (This set contains one number, 13, and it is odd)
        assert sumOdd(100, -100) == -1; // should return -1
        assert sumOdd(100, 1000) == 247500; // should return 247500
    }

    private static void testDiagonalStar() {
        DiagonalStar.printSquareStar(1);
        DiagonalStar.printSquareStar(2);
        DiagonalStar.printSquareStar(3);
        DiagonalStar.printSquareStar(4);
        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(6);
        DiagonalStar.printSquareStar(7);
        DiagonalStar.printSquareStar(8);
        DiagonalStar.printSquareStar(18);
    }
}

package academy.learnprogramming;

/**
 * @author Matt Luffman
 * Date: 4/20/2021
 * Time: 1:31 PM
 */
public class MethodOverloading {

    private static final double CM_PER_INCH = 2.54;
    private static final int INCH_PER_FOOT = 12;

    public static void main(String[] args) {
        // int newScore = calculateScore("Tim", 500);
        // System.out.println("New Score is " + newScore);
        // calculateScore(75);
        // calculateScore();

        // testing: https://www.metric-conversions.org/length/feet-to-centimeters.htm
        double result = calcFeetAndInchesToCentimeters(18, 8.7);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(8.7);
        System.out.println(result);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name,no player score");
        return 0;
    }

    // TODO: if this was anything other than an exercise, refactor multiple return points.
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1d;
        } else {
            double feetToCM = INCH_PER_FOOT * feet * CM_PER_INCH;
            double inchesToCM = inches * CM_PER_INCH;
            return feetToCM + inchesToCM;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1d;
        } else {
            double feet = Math.floor(inches / INCH_PER_FOOT);
            double remainingInches = inches % INCH_PER_FOOT;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}

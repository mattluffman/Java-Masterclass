package academy.learnprogramming.methods;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10_000, 8, 200);
        System.out.println("Your final score was " + highScore);

        // challenge
        displayHighScorePosition("Matt", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(900));
        displayHighScorePosition("Joe", calculateHighScorePosition(400));
        displayHighScorePosition("Tim", calculateHighScorePosition(50));
        // he used tim, bob, Percy, & Gilbert :P

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

        }

        return finalScore;
    }

    public static void displayHighScorePosition(String player, int position) {
        System.out.println(String.format("%s managed to get into position %d on the high score table", player, position));
    }

    public static int calculateHighScorePosition(int score) {
        int result = 4;
        if (score >= 1000) {
            result = 1;
        } else if (score >= 500) {
            result = 2;
        } else if (score >= 100) {
            result = 3;
        }

        return result;
    }
}

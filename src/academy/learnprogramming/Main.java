package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore(true, 10_000, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }

        return finalScore;
    }
}

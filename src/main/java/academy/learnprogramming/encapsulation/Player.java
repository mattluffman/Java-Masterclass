package academy.learnprogramming.encapsulation;

/**
 * section 7, lecture 93
 * This one shows why encapsulation is needed
 *
 * @author Matt Luffman
 * Date: 5/6/2022
 * Time: 5:21 PM
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}

package academy.learnprogramming.encapsulation;

/**
 * section 7, lecture 93
 * an improved value of {@link Player}
 *
 * @author Matt Luffman
 * Date: 5/6/2022
 * Time: 5:27 PM
 */
public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Matt";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200; // cheating
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        System.out.println();

        EnhancedPlayer player2 = new EnhancedPlayer("Matt", 250, "Sword");
        System.out.println("Initial health is " + player2.getHealth());

        damage = 10;
        player2.loseHealth(damage);
        System.out.println("Remaining health = " + player2.getHealth());

        damage = 91;
        // player2.health = 200; // no cheating here, this won't work
        player2.loseHealth(damage);
        System.out.println("Remaining health = " + player2.getHealth());
    }
}

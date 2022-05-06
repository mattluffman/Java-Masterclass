package academy.learnprogramming.encapsulation;

/**
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

    }
}

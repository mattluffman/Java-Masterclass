package academy.learnprogramming.controlflow.switchstatement.challenges;

/**
 * section 5, lecture 63
 * exercise for char & string switch statements
 *
 * @author Matt Luffman
 * Date: 4/28/2021
 * Time: 5:11 PM
 */
public class CharAndString {

    public static void main(String[] args) {
        // challenge 1
        charSwitch('e');
        charSwitch('Z');
        charSwitch('a');
        charSwitch('B');
        charSwitch('c');
        charSwitch('D');

        stringSwtich("june");
        stringSwtich("JuNE");
        stringSwtich("january");
        stringSwtich("januARY");
        stringSwtich("november");
    }

    public static void charSwitch(char switchVar) {
        switch (switchVar) {
            case 'a':
            case 'A':
                System.out.println("Character A was found.");
                break;
            case 'b':
            case 'B':
                System.out.println("Character B was found.");
                break;
            case 'c':
            case 'C':
                System.out.println("Character C was found.");
                break;
            case 'd':
            case 'D':
                System.out.println("Character D was found.");
                break;
            case 'e':
            case 'E':
                System.out.println("Character E was found.");
                break;
            default:
                System.out.println("Could not find A-E");
                break;
        }
    }

    public static void stringSwtich(String month) {
        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}

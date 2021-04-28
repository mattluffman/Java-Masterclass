package academy.learnprogramming.controlflow.switchstatement;

/**
 * starting in section 5, lecture 63
 *
 * @author Matt Luffman
 * Date: 4/26/2021
 * Time: 1:43 PM
 */
public class Switch {

    public static void main(String[] args) {
        /*int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/

        // switch equivalent of the above if series
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break; // always add breaks, even for the default. Will be less confusing to jr devs.
        }

    }
}

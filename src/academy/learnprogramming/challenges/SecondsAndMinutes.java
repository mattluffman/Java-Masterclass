package academy.learnprogramming.challenges;

/**
 * section 4, lecture 60 challenge Seconds & minutes
 * @author Matt Luffman
 * Date: 4/24/2021
 * Time: 5:14 PM
 */
public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(62, 12));
        System.out.println(getDurationString(-62, 12));
        System.out.println(getDurationString(3660));
        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        } else {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            return String.format("%dh %dm %ds", hours, remainingMinutes, seconds);
        }
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0 ) {
            return "Invalid Value";
        } else {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}

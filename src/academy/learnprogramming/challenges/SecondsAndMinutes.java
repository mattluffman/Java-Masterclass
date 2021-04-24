package academy.learnprogramming.challenges;

/**
 * section 4, lecture 60 challenge Seconds & minutes
 * @author Matt Luffman
 * Date: 4/24/2021
 * Time: 5:14 PM
 */
public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(62, 12));
        System.out.println(getDurationString(-62, 12));
        System.out.println(getDurationString(3660));
        System.out.println(getDurationString(3660));
        System.out.println(getDurationString(3945L));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursStr = hours + "h";
            if (hours < 10) {
                hoursStr = "0" + hoursStr;
            }

            String minStr = remainingMinutes + "m";
            if (remainingMinutes < 10) {
                minStr = "0" + minStr;
            }

            String secondsStr = remainingMinutes + "s";
            if (remainingMinutes < 10) {
                secondsStr = "0" + secondsStr;
            }
            return String.format("%s %s %s", hoursStr, minStr, secondsStr);
        }
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0 ) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}

public class MinutesToYearsAndDays {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long days = (minutes / 60) / 24;
            long remainingDays = days % 365;
            long years = days / 365;
            minutes = minutes;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}

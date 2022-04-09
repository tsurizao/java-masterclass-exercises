public class LeapYearCalculator {


    public static boolean isLeapYear(int year) {
        //Determines whether the year is a Leap Year
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 100 == 0 && year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

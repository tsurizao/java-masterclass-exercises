public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {

        // Compares decimal points to the 3rd (thousandths) decimal point

        one = 1000 * one;
        two = 1000 * two;

        if ((int) one == (int) two) {
            return true;
        } else {
            return false;
        }
    }
}

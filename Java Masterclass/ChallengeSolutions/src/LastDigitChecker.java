public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {

        // Determines whether at least two numbers have the
        // same first digit in a group of three numbers
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }
        a %= 10;
        b %= 10;
        c %= 10;
        return ((a == b) || (a == c) || (b == c));


    }

    public static boolean isValid(int x) {

        // Determines whether the value is in the desired range.
        return (x >= 10 && x <= 1000);
    }
}

public class PerfectNumberForLoop {
    public static boolean isPerfectNumber(int number) {

        // Intended to find a "perfect number" which is a number that
        // equals the sum of it's perfect divisors
        // I.E. 6 can be divided by 1, 2 and 3 with zero remainder
        // 1 + 2 + 3 = 6 Therefor 6 is a "perfect number".
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i != number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }
}

public class EqualityPrinter {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printEqual(int x, int y, int z) {
        // Determines whether some or all numbers are equal to each other
        if (x < 0 || y < 0 || z < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (x == y && y == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && y != z && z != x) {
            System.out.println("All numbers are different");
        } else System.out.println("Neither all are equal or different");
    }
}

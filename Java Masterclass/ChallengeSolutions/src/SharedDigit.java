public class SharedDigit {

    // Determines if x and y have any shared digits
    public static boolean hasSharedDigit(int x, int y) {
        return (x >= 10 && x <= 99 && y >= 10 && y <= 99) && (x % 10 == y % 10 || x % 10 == y / 10 || x / 10 == y % 10 || x / 10 == y / 10);
    }
}

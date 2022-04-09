public class TeenNumberChecker {

    public static boolean hasTeen(int one, int two, int three) {

        return (one >= 13 && one <= 19) || (two >= 13 && two <= 19) || (three >= 13 && three <= 19);
    }

    public static boolean isTeen(int one) {
        return one >= 13 && one <= 19;
    }
}

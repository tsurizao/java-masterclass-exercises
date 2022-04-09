public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        // Determines if a cat is playing depending on the temperature and whether it's summer
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        }
        return temperature >= 25 && temperature <= 35;
    }
}

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // Determines whether I should wake up depending on the time of day the dog is barking.
        // Between the hours of 8 and 22 should return false because I am not asleep.
        // If the dog is not barking should return false as well.
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay < 8 && barking || hourOfDay > 22 && barking) {
            return true;
        } else {
            return false;
        }
    }
}

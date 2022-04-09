public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        // bigCount represents a 5 kilogram package of flour
        // smallCount represents a 1 kilogram package of flour
        // goal represents a customer's desired amount
        // This method determines whether we can fulfill the EXACT
        // amount the customer wants.
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount * 5 + smallCount < goal){
            return false;
        }
        return goal % 5 <= smallCount;
    }
}

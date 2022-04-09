public class AllFactorsWhileLoop {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println(INVALID_VALUE_MESSAGE);
        }

        int factor = 1;
        while (factor <= number) {
            if (number % factor == 0) {
                System.out.print(factor + " "); //System.out.print() instead of System.out.println()
            }
            factor++;
        }
        System.out.println(); //adds a line space, just for looks
    }
}

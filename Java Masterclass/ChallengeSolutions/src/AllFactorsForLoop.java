public class AllFactorsForLoop {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printFactors (int number){

        if (number < 1) {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        for (int i = 1 ; i <= number; i++){
            if (number % i == 0){
                System.out.print(i + " "); //System.out.print() instead of System.out.println()
            }
        }
        System.out.println(); //adds a line space, just for looks
    }
}

public class GreatestCommonDivisorForLoop {

    public static int getGreatestCommonDivisor(int first, int second) {

        //This method determines the largest common
        //divisor between two numbers above 10
        //using a For Loop
        if (first < 10 || second < 10) {
            return -1;
        }
        int commonDivisor = 1;
        for (int i = 1; i <= first || i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }
}

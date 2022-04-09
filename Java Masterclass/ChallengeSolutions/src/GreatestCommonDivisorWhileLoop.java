public class GreatestCommonDivisorWhileLoop {

    public static int getGreatestCommonDivisor(int first, int second) {

        //This method determines the largest common
        //divisor between two numbers above 10
        //using a While Loop
        if (first < 10 || second < 10) {
            return -1;
        }

        int commonDivisor = 0;
        int x = 0;
        while (commonDivisor < first || commonDivisor < second){
            commonDivisor++;
            if(first % commonDivisor == 0 && second % commonDivisor == 0){
                x = commonDivisor;
            }
        }
        return x;
    }
}

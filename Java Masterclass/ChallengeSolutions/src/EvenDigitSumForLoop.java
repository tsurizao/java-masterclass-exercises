public class EvenDigitSumForLoop {

    public static int getEvenDigitSum(int number) {

        //Adds the even digits of a number together
        int sum = 0;
        if (number >= 0) {
            for (int i = number; i > 0; i /= 10) {
                if (i % 2 == 0) {
                    sum += i % 10;
                }
            }
            return sum;
        }
        return -1;
    }
}

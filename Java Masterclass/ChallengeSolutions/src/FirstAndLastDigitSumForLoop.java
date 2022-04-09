public class FirstAndLastDigitSumForLoop {
    public static int sumFirstAndLastDigit(int number) {

        //Adds the first and last digit in any number
        //Single digits numbers such as "5" are added twice
        //since it's technically the first and last digit
        if (number >= 0) {
            int sum = 0;
            for (int i = number; i != 0; i /= 10) {
                int lastNumber = number % 10;
                sum = lastNumber + i;
            }
            return sum;
        }
        return -1;
    }
}

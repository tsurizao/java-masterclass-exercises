public class FirstAndLastDigitSumWhileLoop {

    public static int sumFirstAndLastDigit(int number) {

        //Adds the first and last digit in any number
        //Single digits numbers such as "5" are added twice
        //since it's technically the first and last digit
        int sum = 0;
        int lastDigit = 0;
        int firstDigit = 0;
        if (number >= 0) {
            lastDigit = number % 10;
            while (number >= 10) {
                number = number / 10;
            }
            firstDigit = number;
            sum = lastDigit + firstDigit;
            return sum;
        }
        return -1;
    }
}

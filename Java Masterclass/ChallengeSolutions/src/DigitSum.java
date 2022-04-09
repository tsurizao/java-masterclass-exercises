public class DigitSum {

    public static int sumDigits (int number){

        // Adds all the digits in a number together
        if (number < 10){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            sum+=number % 10;
            number = number / 10;
        } return sum;
    }
}

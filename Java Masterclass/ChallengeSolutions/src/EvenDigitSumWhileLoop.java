public class EvenDigitSumWhileLoop {

    public static int getEvenDigitSum(int number) {

        //Adds the even digits of a number together
        if (number >= 0) {
            int sum = 0;
            while (number > 0) {
                if (number % 2 == 0) {
                    sum += number % 10;
                }
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}

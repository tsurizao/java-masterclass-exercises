public class NumberToWords {
    private final static String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        if (number == 0){
            System.out.println("Zero");
        }
        int digitsX = getDigitCount(number);
        number = reverse(number);
        int digitsY = getDigitCount(number);
        for (int i = number; i != 0; i /= 10) {
            int tempNumber = i % 10;
            switch (tempNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } while (digitsX != digitsY){
            System.out.println("Zero");
            digitsX -= 1;
        }
    }

    public static int reverse(int number) {

        int reverse = 0;
        for (int i = number; i != 0; i /= 10) {
            int digit = i % 10;
            reverse = (reverse * 10) + digit;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        int digits = 0;
        for (int i = number; i != 0; i /= 10) {
            digits += 1;
        }
        if (digits == 0) {
            digits += 1;
        }
        return digits;
    }
}

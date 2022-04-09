public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        //Determines whether a number is a palindrome number.
        int reverse = 0;
        int newNumber = number;
        while (newNumber != 0) {
            int digit = newNumber % 10;
            reverse = ((reverse * 10) + digit);
            newNumber = newNumber / 10;

            if (number == reverse) {
                return true;
            }
        }
        return false;
    }
}

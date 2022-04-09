public class Sum3And5 {

    public static int sum3And5(int start, int end) {
        // This will determine the numbers in a range that are divisible
        // by 3 and 5.  It will add them all together once it finds 5
        // numbers that meet the condition.
        if (end < start || start <= 0) {
            return -1;
        }
        int sum = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        return sum;
    }
}
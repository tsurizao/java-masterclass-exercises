public class LargestPrimeFactor {
    // Calculates the largest prime number that is also factor of a given number
    public static int getLargestPrime(int number) {
        if (number >= 2) {
            int factor = 0;
            for (int i = 1; i <= number; i++) {
                if (i <= 1){
                    continue;
                }
                if (number % i == 0) {
                    int count = 0;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    } if (count == 0){
                        factor = i;
                    }
                }
            }
            return factor;
        }
        return -1;
    }
}

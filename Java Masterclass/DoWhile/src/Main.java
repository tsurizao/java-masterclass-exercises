public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 1; i < 6; i++) {
            System.out.println("Count value is " + i);

        }
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
//        count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if(count > 100){
//                break;
//            }
//        } while (count != 6);
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (evenNumbersFound >= 5) {
                System.out.println("Found five even numbers");
                break;
            }

            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
        }

    }


    public static boolean isEvenNumber(int number) {
        return ((number % 2) == 0);
    }
}
import java.util.Scanner;

public class MinAndMax {
    public static void MinAndMax() {
        {// Converted into a method for ease of access in Main Class

            Scanner scanner = new Scanner(System.in);
            int min = 0;
            int max = 0;
            boolean first = true;
            System.out.println("This keeps track of the highest and lowest number you enter.  Enter a letter to stop.");
            while (true) {
                System.out.println("Enter a number:");
                boolean isThisAnInt = scanner.hasNextInt();
                if (isThisAnInt) {
                    int number = scanner.nextInt();
                    if (first) {
                        first = false;
                        max = number;
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                } else {
                    break;
                }
            }
            scanner.close();
            System.out.println("Your highest number was " + max + " and your lowest number was " + min + ".");
        }
    }
}
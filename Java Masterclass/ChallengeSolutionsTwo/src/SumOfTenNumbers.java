import java.util.Scanner;

public class SumOfTenNumbers {

    public static void getTenNumbers()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers and I'll add them up.");

        int counter = 1;
        int sum = 0;

        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid Number.  Please try again.");
            }
            scanner.nextLine();
        }
        System.out.println("The total sum is " + sum + "!");
        scanner.close();
    }
}
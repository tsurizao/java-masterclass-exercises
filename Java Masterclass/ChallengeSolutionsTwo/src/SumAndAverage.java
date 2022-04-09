import java.util.Scanner;

public class SumAndAverage {

    // Calculates the sum of all entered numbers and
    // calculates the average of all entered numbers.
    // Enter a non-numerical value to stop the loop.
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        long avgCount = 0;
        System.out.println("Enter a number then press enter, you can add as many numbers as you want.");
        System.out.println("When you're done enter a non numerical key such as 'a'");
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                avgCount+=1;
                int number = scanner.nextInt();
                sum += number;
                avg += number;

            } else {
                break;
            }
        }
        avg = Math.round((double)avg / avgCount);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}

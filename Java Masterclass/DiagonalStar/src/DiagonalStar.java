public class DiagonalStar {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static final String STAR = "*";

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                if (row == 0 || row == number - 1) System.out.print(STAR);
                else if (column == 0) System.out.print(STAR);
                else if (column == number - 1) System.out.print(STAR);
                else if (column == row) System.out.print(STAR);
                else if (column == number - 1 - row) System.out.print(STAR);
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
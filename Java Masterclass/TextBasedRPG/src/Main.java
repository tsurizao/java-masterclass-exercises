import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PlayerCharacter name = new PlayerCharacter();
        System.out.println("Please enter the name of your character: ");
        while (true) {
            if (scanner.hasNextInt()) {
                System.out.println("Please enter the name of your character(no numbers): ");
                scanner.hasNextLine();
            } else if (scanner.hasNext()) {
                name.setName();
                break;
            }
            System.out.println(name.name);
        }
    }
}
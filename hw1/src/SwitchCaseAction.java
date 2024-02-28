import java.util.Scanner;

// Name: Canhui Huang
// Problem 8: The Switch Case in Action
public class SwitchCaseAction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:" +
        "\n 1 - Say Hello" +
        "\n 2 - Convert to Uppercase" +
        "\n 3 - Convert to Lowercase" +
        "\n 4 - Exit");

        System.out.print("Select option: ");
        String option = scanner.nextLine();
        String word;
        switch (option) {
            case "1":
                System.out.println("Hello, User!");
                break;
            case "2":
                System.out.print("Enter a string: ");
                word = scanner.nextLine();
                System.out.println("Word in uppercase: " + word.toUpperCase());
                break;
            case "3":
                System.out.print("Enter a string: ");
                word = scanner.nextLine();
                System.out.println("Word in uppercase: " + word.toLowerCase());
                break;
            case "4":    
            default:
                System.out.print("You have exited the program.");
                break;
        }

        scanner.close();
    }
}
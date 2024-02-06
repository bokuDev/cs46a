import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("What's your name?");

        // Read the user's input
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to the world of Java programming.");

        // Close the scanner
        scanner.close();
    }
}

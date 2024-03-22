import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        // Set a predefined password
        final String CORRECT_PASSWORD = "ProgrammingLab2023";

        // Prompt the user to enter the password
        Scanner scan = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = scan.nextLine();

            // If the password is incorrect, inform the user
            if (!password.equals(CORRECT_PASSWORD)) {
                System.out.println("Access denied. Incorrect password");
            }
        } while (!password.equals(CORRECT_PASSWORD));
        scan.close();

        // If the password is correct, display a success message
        if (password.equals(CORRECT_PASSWORD)) {
            System.out.println("Access granted!");
        }
    }
}

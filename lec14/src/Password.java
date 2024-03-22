import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String CORRECT_PASSWORD = "CS46A";
        String password;
        int tries = 0;

        do {
            System.out.print("Enter password: ");
            password = scan.nextLine();

            tries++;
        } while (!password.equals(CORRECT_PASSWORD) && tries < 3);
        scan.close();

        if (password.equals(CORRECT_PASSWORD)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied");
        }
    }
}

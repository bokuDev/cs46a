import java.util.Scanner;

// Canhui Huang
// Exercise 8
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if ( num < 0) System.out.println("It's negative.");
        else if (num == 0) System.out.println("It's zero.");
        else System.out.println("It's positive.");
    }
}

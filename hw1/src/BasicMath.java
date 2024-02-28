import java.util.Scanner;

// Name: Canhui Huang
// Problem 1: Basic Arithmetic Operations
public class BasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.println("Enter second integer (b): ");
        int b = scanner.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        scanner.close();
        
    }
}
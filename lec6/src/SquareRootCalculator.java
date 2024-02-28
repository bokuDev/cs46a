import java.util.Scanner;

// Canhui Huang
// Exercise 6
public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double number: ");
        double input = scanner.nextDouble();
        scanner.close();

        System.out.println("Square root of value: " + Math.sqrt(input));
    }
}

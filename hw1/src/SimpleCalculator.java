import java.util.Scanner;

// Name: Canhui Huang
// Problem 9: Simple Calculator with Switch Case
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operand 1: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter operator: ");
        String op = scanner.nextLine();
        System.out.print("Enter operand 2: ");
        double b = Double.parseDouble(scanner.nextLine());
        scanner.close();

        switch (op) {
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case "/":
                if (b == 0) System.out.println("Error - Dividing by zero");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                break;
        }
    }
}
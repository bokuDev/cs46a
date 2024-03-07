import java.util.Scanner;
// Problem 5
/**
 * Represents a Calculator
 * @author Canhui Huang
 */
public class Calculator {

    /**
     * Display the result of the sum of two numbers
     * @param a the first operand
     * @param b the second operand
     */
    public void add(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    /**
     * Display the result of the difference between two numbers
     * @param a the first operand
     * @param b the second operand
     */
    public void subtract(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    /**
     * Display the result of the product of two numbers
     * @param a the first operand
     * @param b the second operand
     */
    public void multiply(double a, double b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    /**
     * Display the result of the division of two numbers
     * @param a the first operand
     * @param b the second operand
     */
    public void divide(double a, double b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    /**
     * main method that demonstrates the functionality of your calculator 
     * by accepting user input and showing results
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        double a, b;
        String operator;

        System.out.print("Insert first number: ");
        a = scanner.nextDouble(); scanner.nextLine();

        System.out.print("Insert operator (+, -, *, /): ");
        operator = scanner.nextLine();

        System.out.print("Insert second number: ");
        b = scanner.nextDouble();
        scanner.close();

        switch (operator) {
            case "+":
                calculator.add(a, b);
                break;
            case "-":
                calculator.subtract(a, b);
                break;
            case "*":
                calculator.multiply(a, b);
                break;
            case "/":
                calculator.divide(a, b);
                break;
            default:
            System.out.println("Invalid input");
                break;
        }
    }
}
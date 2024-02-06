public class Main {
    public static void main(String[] args) {
        // Declare variables
        int num1 = 18;
        int num2 = 5;

        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int intQuotient = num1/num2;
        double doubleQuotient = (double) num1 / num2; // Cast num1 to double for

        // Print results
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Int quotient: " + intQuotient);
        System.out.println("Double quotient: " + doubleQuotient);
    }
}

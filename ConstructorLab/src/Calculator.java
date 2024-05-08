public class Calculator {
    // Exercise 1 add methods
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Exercise 3 multiply methods
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public double multiply(double doubleVal, int intVal) {
        return doubleVal * intVal;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Test add methods: ");
        System.out.println("2 + 7 = " + calculator.add(2, 7));
        System.out.println("2 + 7 + 9 = " + calculator.add(2, 7, 9));
        System.out.println("2.5 + 7.7 = " + calculator.add(2.5, 7.7));

        System.out.println("\nTest multiply methods: ");
        System.out.println("2 * 7 = " + calculator.multiply(2, 7));
        System.out.println("2.0 * 7 = " + calculator.multiply(2.0, 7));
        System.out.println("2.5 * 7 = " + calculator.multiply(2.5, 7));
        System.out.println("2.5 * 7.0 = " + calculator.multiply(2.5, 7.0));
        System.out.println("2.5 * 7.7 = " + calculator.multiply(2.5, 7.7));
    }
}

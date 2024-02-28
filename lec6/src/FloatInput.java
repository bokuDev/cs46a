import java.util.Scanner;

// Canhui Huang
// Exercise 5
public class FloatInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float number: ");
        float input = scanner.nextFloat();
        scanner.close();

        System.out.println("Rounded value: " + Math.round(input * 100.0) / 100.0);
    }
}

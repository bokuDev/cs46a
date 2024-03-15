import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1, factorial = 1;

        // Get user input, ensure non-negative
        System.out.print("Insert number: ");
        int number = scan.nextInt();
        while(number < 0) {
            System.out.print("Insert number (non-negative): ");
            number = scan.nextInt();
        }

        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + number + " is: " +
        factorial);
        scan.close();
        
    }
}

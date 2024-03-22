import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        // Prompt the user for a positive integer n
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive integer: ");
            n = scan.nextInt();
        } while (n <= 0);
        scan.close();

        // Calculate the sum of the series from 1 to 1/n
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (i + 1);
        }

        // Display the result
        System.out.println("The sum of the series is: " + sum);
    }
}

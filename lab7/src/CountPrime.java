import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        // Prompt the user for a positive integer n.
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive integer: ");
            n = scan.nextInt();
        } while (n <= 0);
        scan.close();

        // Count the prrime numbers up to n.
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) count++;
        }

        // Display the total number of primes up to n.
        System.out.println("Total number of primes up to " + n + " is: " + count);
    }

    public static boolean isPrime(int n) {
        // if n is 0 or 1
        if (n == 0 || n == 1) return false;

        // Check whether is divisible by ONLY 1 & itself
        for (int i = 2; i <= n; i++) {
            if (i == n) break;

            if (n % i == 0) return false;
        }
        return true;
    }
}

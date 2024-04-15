// 3. Prime Checker
// Write a Java program that checks if a given number n is prime or not using loops

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input : n = ");
        int n = in.nextInt();


        System.out.print("Output: " + n);
        if (isPrime(n)) System.out.println(" is a prime number.");
        else System.out.println(" is not a prime number.");
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;

        // Check if n is divisible by any number from (1,17) exclusive
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
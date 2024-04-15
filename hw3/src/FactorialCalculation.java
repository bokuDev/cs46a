// 1. Factorial Calculation
// Write a Java program to compute the factorial of a given number n using loops.

import java.util.Scanner;
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input : n = ");
        int n = in.nextInt();

        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        System.out.println("Output: " + result);
    }
}
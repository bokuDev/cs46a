// 4. Table Generator
// Write a Java program to display the multiplication table of a given number n up to 10.

import java.util.Scanner;

public class TableGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input : n = ");
        int n = in.nextInt();

        System.out.println("Output:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
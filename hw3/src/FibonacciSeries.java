// 2. Fibonacci Series
// Write a Java program that generates the Fibonacci series up to a given number n using
//loops.

import java.util.Scanner;
import java.util.ArrayList;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input : n = ");
        int n = in.nextInt();

        ArrayList<Integer> series = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (i == 0) series.add(0);
            else if (i == 1) series.add(1);
            else {
                series.add(series.get(i - 1) + series.get(i - 2));
            }
        }
        System.out.println("Output: " + series);
    }
}
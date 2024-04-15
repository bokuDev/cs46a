// 8. Find the smallest divisor of a number n (other than 1)

import java.util.Scanner;
public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input : n = ");
        int n = in.nextInt();

        int min = n;
        for (int i = 1; i < n; i++) {
            if ( n % i == 0 && i < min && i != 1) min = i;
        }
        if (min == 1 || min == n) System.out.println("No smallest divisor found for " + n);
        else System.out.println("Smallest divisor of " + n + " is: " + min);
    }
}
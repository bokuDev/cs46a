// 7. Calculate the sum of the first n natural numbers

import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input : n = ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Output: " + sum);
    }
}
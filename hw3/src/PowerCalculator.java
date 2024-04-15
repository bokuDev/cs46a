// 10. Calculate the power of a number using a loop. For example, power(3, 4) should return 3^4=81

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input : number = ");
        int number = in.nextInt();
        System.out.print("Input : power = ");
        int power = in.nextInt();

        System.out.println("power(" + number + ", " + power + ") = " + power(number, power));
    }

    public static int power(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
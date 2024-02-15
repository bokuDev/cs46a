import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        // Problem 1: Temperature Checker

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature value: ");
        int input = scan.nextInt();

        if (input < 0) {
            System.out.print("It is freezing");
        } else if (input <= 10) {
            System.out.print("It is cold");
        } else if (input <= 20) {
            System.out.print("It is mild");
        } else if (input <= 30) {
            System.out.print("It is warm");
        } else {
            System.out.print("It is hot");
        }
    }
}

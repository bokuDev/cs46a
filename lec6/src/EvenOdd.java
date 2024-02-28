import java.util.Scanner;

// Canhui Huang
// Exercise 7
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if ( num % 2 == 0) System.out.println("It's even.");
        else System.out.println("It's odd.");
    }
}

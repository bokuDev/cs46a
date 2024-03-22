import java.util.Scanner;

public class NonNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, sum = 0;
        do {
            System.out.print("Enter a non-negative number: ");
            input = scan.nextInt();

            if (input >=0) sum += input;
        } while (input >= 0);
        scan.close();

        System.out.println("Total sum of non-negative numbers: " + sum);
    }
}

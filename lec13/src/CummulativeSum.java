import java.util.Scanner;

public class CummulativeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        while(true) {
            System.out.print("Enter a number: ");
            double num = scan.nextDouble();
            sum += num;

            if (sum > 50) {
                System.out.println("Total sum: " + sum + ", Last number: " + num);
                break;
            }
        }

        scan.close();
    }
}

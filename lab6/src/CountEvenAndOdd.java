import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countEven = 0, countOdd = 0, i = 1;
        System.out.print("Insert n: ");
        int n = scan.nextInt();
        while (i <= n) {
            if (i % 2 == 0) countEven++;
            else countOdd++;
            i++;
        }
        System.out.println("Even Numbers: " + countEven);
        System.out.println("Odd Numbers: " + countOdd);
        scan.close();
    }
}

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Prompt the user for a positive integer n.
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a positive integer: ");
            num = scan.nextInt();
        } while (num <= 0);
        scan.close();
        
        // Reverse the number
        String stringifiedNumber = "" + num;
        String stringifiedReversedNumber = "";
        for (int i = stringifiedNumber.length() - 1; i >= 0; i--) {
            stringifiedReversedNumber += stringifiedNumber.charAt(i);
        }
        int reversedNumber = Integer.parseInt(stringifiedReversedNumber);

        // Check if the reversed number matches the original number
        // Then, display a message based on the result
        if (num == reversedNumber) {
            System.out.println("The original number: " + num + " matches with " + reversedNumber);
        } else {
            System.out.println("The original number: " + num + " doesn't match with " + reversedNumber);
        }
    }
}

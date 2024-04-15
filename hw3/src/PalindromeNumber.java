// 9. Check whether a number is a palindrome or not

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input : n = ");
        String number = in.nextLine();

        if (isPalindrome(number)) System.out.println("The number " + number + " is palindrome");
        else System.out.println("The number " + number + " is not palindrome");
    }

    public static boolean isPalindrome(String number) {
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) return false;
        }
        return true;
    }
}
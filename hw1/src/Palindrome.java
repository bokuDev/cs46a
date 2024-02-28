import java.util.Scanner;

// Name: Canhui Huang
// Problem 2: Palindrome Checker
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("It is palindrome!");
        }
        else {
            System.out.println("It is not palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        // Trim non-alphanumeric characters & make the word case insensitive by making every character lowercase
        String trimmedWord = "";
        String allowedCharacters = "0123456789abcdefghijklmnopqrstuvwxyz";
        String loweredCaseWord = word.toLowerCase();
        for (int i = 0; i < loweredCaseWord.length(); i++) {
            if (allowedCharacters.indexOf(loweredCaseWord.charAt(i)) >= 0) {
                trimmedWord += loweredCaseWord.charAt(i);
            }
        }
        
        // Palindrome check logic
        for (int i = 0; i < trimmedWord.length() / 2; i++) {
            if (trimmedWord.charAt(i) != trimmedWord.charAt(trimmedWord.length() - 1 - i)) return false;
        }
        return true;
    }
}
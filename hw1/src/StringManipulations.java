import java.util.Scanner;

// Name: Canhui Huang
// Problem 3: String Manipulations
public class StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println(word + " length: " + word.length());
        System.out.println(word + " in uppercase: " + word.toUpperCase());
        System.out.println(word + " in lowercase: " + word.toLowerCase());
        System.out.println(word + " starts with \"Java\": " + (word.startsWith("Java") ? "Yes" : "No"));

        System.out.print("Enter another word: ");
        String word2 = scanner.nextLine();
        System.out.println(word + " contains \"" + word2 + "\": " + word.contains(word2));
        scanner.close();
    }
}
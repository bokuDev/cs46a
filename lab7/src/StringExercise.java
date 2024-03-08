import java.util.Scanner;

/**
 * Lab 5.
 * Program that asks the user to enter a sentence. Use string methods to
 * display its length, convert it to uppercase and lowercase, and extract a substring
 * @author Canhui Huang
 */
public class StringExercise {
    public static void main(String[] args) {
        // Part 1
        Scanner scan = new Scanner(System.in);
        System.out.print("Part 1) \nEnter a sentence: ");
        String sentence = scan.nextLine();

        System.out.println("Length: " + sentence.length());
        System.out.println("To uppercase: " + sentence.toUpperCase());
        System.out.println("To lowercase: " + sentence.toLowerCase());
        System.out.println("Substring \"Always\": " + sentence.substring(0,6));

        // Part 2
        if (sentence.length() < 10) System.out.println("Sentence is short");
        else if (sentence.length() > 10 && sentence.length() <= 20) System.out.println("Sentence is medium");
        else if (sentence.length() > 20) System.out.println("Sentence is long");

        // Part 3
        System.out.print("\nPart 3) \nEnter a new sentence: ");
        String sentence2 = scan.nextLine();
        scan.close();
        TextAnalyzer textAnalyzer = new TextAnalyzer(sentence2);

        textAnalyzer.textLength();
        textAnalyzer.showTextInUppercase();
        textAnalyzer.showTextInLowercase();
        textAnalyzer.showSubstring(0, 6);
        textAnalyzer.showTextCategory();
    }
}

import java.util.Scanner;

// Name: Canhui Huang
// Problem 5: Complex String Manipulations
public class ComplexStringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scanner.nextLine();
        scanner.close();
        
        // Manipulation part 1
        int vowels = 0, consonants = 0;
        for (int i = 0; i < word.length(); i++) {
            // Only count alphabets
            if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(word.charAt(i)) >= 0) {
                switch (word.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowels++;
                        break;
                    default:
                        consonants++;
                        break;
                }
            }
        }
        if (vowels > consonants) word = word.toUpperCase();
        else word = word.toLowerCase();

        // Manipulation part 2
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            newWord += formattedChar(word.charAt(i));
        }
        System.out.println("Manipulated string: " + newWord);
    }

    public static String formattedChar(char digit) {
        switch (digit) {
            case '1': return "one";
            case '2': return "two";
            case '3': return "three";
            case '4': return "four";
            case '5': return "five";
            case '6': return "six";
            case '7': return "seven";
            case '8': return "eight";
            case '9': return "nine";
            case '0': return "zero";
            default:
                return "" + digit;
        }
    }
}
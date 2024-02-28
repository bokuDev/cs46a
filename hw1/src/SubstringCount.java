import java.util.Scanner;

// Name: Canhui Huang
// Problem 4: Substring Count
public class SubstringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter a substring: ");
        String substring = scanner.nextLine();
        scanner.close();
        
        System.out.println(substring + " appears " + (substringCount(mainString, substring)) + " times.");
    }

    public static int substringCount(String mainString, String subString) {
        int count = 0;
        int endIndex = subString.length();
        int beginIndex = 0;
        while (endIndex <= mainString.length()) {
            System.out.println(mainString.substring(beginIndex, endIndex));
            if (mainString.substring(beginIndex, endIndex).equals(subString)) count++;

            endIndex++;
            beginIndex++;
        }
        return count;
    }
}
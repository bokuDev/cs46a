public class Problem2 {
    public static void main(String[] args) {
        String s = "Programming in Java is Fun!";

        // 1. Retrieve and print the sixth character
        char sixthChar = s.charAt(5);
        System.out.println("1. Sixth Character: " + sixthChar);

        // 2. Extract and print the word "Java" from the string
        String extractedWord = s.substring(15, 19);
        System.out.println("2. Extracted Word: " + extractedWord);

        // 3. Check if the string contains the substring "Java" and print the result
        boolean containsJava = s.contains("Java");
        System.out.println("3. Contains 'Java'? " + containsJava);

        // 4. Replace the word "Fun" with "Awesome" and print the new string
        String replaceString = s.replace("Fun", "Awesome");
        System.out.println("4. New string: " + replaceString);

        // 5. Convert the entire string to uppercase and print the result
        String uppercaseString = s.toUpperCase();
        System.out.println("5. Uppercase String: " + uppercaseString);
    }
}

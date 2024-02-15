public class StringExplorer {
    public static void main(String[] args) {
        String text = " Hello World! ";

        System.out.println("Original string: \"" + text + "\"");

        // 1) Length
        System.out.println("Length: " + text.length());

        // 2) Character at index = 7
        System.out.println("Character at index 7: " + text.charAt(7));

        // 3) Substring w/ start index = 2 & end index = 6
        System.out.println("Substring(2,6): \"" + text.substring(2,6) + "\"");

        // 4) Contains = "World"
        System.out.println("Contains \"World\": " + text.contains("World"));

        // 5) Compare to " Hello, World! "
        String text2 = " Hello, World! ";
        System.out.println("Equals \"" + text2 + "\": " + text.equals(text2));

        // 6) Compare to " hello world! " ignoring case differences
        String text3 = " hello world! ";
        System.out.println("Equals ignore case \"" + text3 + "\": " + text.equalsIgnoreCase(text3));

        // 7) Convert the entire string to lower case
        System.out.println("To lower case: \"" + text.toLowerCase() + "\"");

        // 8) Convert the entire string to upper case
        System.out.println("To uppercase case: \"" + text.toUpperCase() + "\"");

        // 9) Remove leading and trailing spaces from a string and print the result
        System.out.println("Trimmed: \"" + text.trim() + "\"");
    }
}

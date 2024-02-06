public class SString {
    public static void main(String[] args) {
        // length()
        String name = "Another Java";
        int len = name.length();

        System.out.println("Length is: " + len);

        // charAt(int n)
        String language = "Java";
        char letter = language.charAt(2);

        System.out.println("Character at 2: " + letter);

        // substring(int startIndex, int endIndex)
        String greeting = "Hello, World!";
        String word = greeting.substring(7,12); // world is "World"

        System.out.println("Substring is: " + word);

        // indexOf(String string)
        String message = "Java is fun!";
        int position = message.indexOf("fun"); // position is 8;

        System.out.println("Index of fun \"is\":" + position);
    }
}

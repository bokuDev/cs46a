// 6. Nested Loop Patterns
// Write a Java program to display the following patterns using nested
//loops

public class NestedLoopPatterns2 {
    public static void main(String[] args) {
        final int HEIGHT = 5;
        for (int i = 0; i < HEIGHT;) {
            String line = "*";
            for (int j = 1; j < i; j++) {
                if (i != HEIGHT - 1) line += " ";
                else line += "*";
            }
            if (i != 0)line += "*";

            System.out.println(line);
        }
    }
}
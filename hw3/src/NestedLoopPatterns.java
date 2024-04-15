// 5. Nested Loop Patterns
// Write a Java program to display the following patterns using nested
//loops

public class NestedLoopPatterns {
    public static void main(String[] args) {
        final int SIZE = 5;
        int inc = 1;
        for (int i = 0; i < SIZE; i += inc) {
            if ( i < 0) break;

            String line = "";
            // Left
            for (int j = i; j < SIZE - 1; j++) {
                line += " ";
            }

            // Middle
            for (int j = 1; j <= i * 2; j++) {
                line += "*";
            }
            line += "*";

            // Right
            for (int j = i; j < SIZE - 1; j++) {
                line += " ";
            }

            System.out.println(line);

            // Flip increment sign
            if ( i == 4 ) inc *= -1;
        }
    }
}
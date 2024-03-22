import java.util.Scanner;

public class StringConcatenator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String SENTINEL_VALUE = "EXIT";
        String text;
        StringBuilder sb = new StringBuilder();
        do {
            System.out.print("Enter a string or type 'EXIT' to stop: ");
            text = scan.nextLine();
            if (!text.equals(SENTINEL_VALUE)) {
                sb.append(text);
            }
        } while (!text.equals(SENTINEL_VALUE));
        scan.close();

        System.out.println("Concatenated String: " + sb.toString());
    }
}

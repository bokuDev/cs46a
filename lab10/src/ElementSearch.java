import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        // Initialize an array with 7 elements of your choice
        String[] names = {"Ana", "Carlos", "Tina", "Juan", "Lydia", "Robert", "Christina"};

        // Prompt the user to enter a value to search in the array
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        String search = in.nextLine();

        // Display whether the value is found in the array and at which index
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(search)) {
                System.out.println(search + " is found at index " + i);
                found = true;
            }
        }
        if (!found) System.out.println(search + " is not found in the array");
    }
}

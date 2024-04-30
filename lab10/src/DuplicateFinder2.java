import java.util.ArrayList;

public class DuplicateFinder2 {
    public static void main(String[] args) {
        // Initialize an array with 10 integers of your choice ensuring some are duplicates
        int[] integers = {0, 3, 9, 7, 5, 2, 9, 5, 6, 0};

        // Identify and display the duplicate values
        ArrayList<Integer> readIntegers = new ArrayList<Integer>();
        ArrayList<Integer> duplicatedValues = new ArrayList<Integer>();
        for (int integer : integers) {
            if (readIntegers.contains(integer) && !duplicatedValues.contains(integer)) {
                duplicatedValues.add(integer);
            }
            readIntegers.add(integer);
        }

        System.out.println("Duplicate values:");
        for (Integer duplicatedValue : duplicatedValues) {
            System.out.println(duplicatedValue);
        }
    }
}

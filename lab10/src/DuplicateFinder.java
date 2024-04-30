import java.util.Scanner;

public class DuplicateFinder {
    public static void main(String[] args) {
        // Initialize an array with 10 integers of your choice ensuring some are duplicates
        int[] integers = {0, 3, 9, 7, 5, 2, 9, 5, 6, 0};

        // Identify and display the duplicate values
        Integer[] readIntegers = new Integer[integers.length];
        Integer[] duplicatedValues = new Integer[integers.length];
        for (int i = 0; i < integers.length; i++) {
            if (contains(readIntegers, integers[i])) {
                duplicatedValues[i] = integers[i];
            }
            readIntegers[i] = integers[i];
        }

        System.out.println("Duplicate values:");
        for (Integer duplicatedValue : duplicatedValues) {
            if (duplicatedValue == null) continue;
            System.out.println(duplicatedValue);
        }
    }

    public static boolean contains(Integer[] integersArray, int target) {
        for (Integer integer : integersArray) {
            if (integer == null) continue;
            if (integer == target) return true;
        }
        return false;
    }
}

public class ReverseArray {
    // 3. Reverse the order of elements in an array of characters. Do not use any additional data structures.
    public static void main(String[] args) {
        char[] characters = {'a','b','c','d','e'};

        System.out.println("Original array: " + displayableChars(characters));
        reverseArray(characters);
        System.out.println("Reversed array: " + displayableChars(characters));
    }

    public static void reverseArray(char[] chars) {
        int left = 0; int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++; right--;
        }
    }

    public static String displayableChars(char[] chars) {
        String displayableString = "{";
        for (int i = 0; i < chars.length; i++) {
            displayableString += chars[i];
            if ( i != chars.length - 1) displayableString += ",";
        }

        displayableString += "}";
        return displayableString;
    }
}

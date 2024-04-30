public class ArrayReversal {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "mango", "melon", "grape"};

        System.out.println("Original Array: ");
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        for (int i = 0; i < fruits.length / 2; i++) {
            String temp = fruits[i];
            fruits[i] = fruits[fruits.length - 1 - i];
            fruits[fruits.length - 1 - i] = temp;
        }

        System.out.println("\nReversed Array: ");
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}

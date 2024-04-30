public class BasicArray {
    public static void main(String[] args) {
        int[] integers = new int[10];

        for (int i = 1; i <= 10; i++) {
            integers[i - 1] = i;
        }

        System.out.println("Array: ");
        for(int value: integers) {
            System.out.println(value);
        }
    }
}

public class SmallestAndLargestNumbers {
    // 4. Find the smallest and largest numbers in an array of integers.
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        findMinMax(numbers);
    }

    public static void findMinMax(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}

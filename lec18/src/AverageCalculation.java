public class AverageCalculation {
    // 2. Write a function that calculates the average of an array of integers.
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        System.out.println("Average: " + average(numbers));
    }

    public static double average(int[] numbers) {
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}

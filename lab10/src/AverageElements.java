public class AverageElements {
    public static void main(String[] args) {
        // Create an array of numbers with size 10
        double[] numbers = new double[10];

        // Initialize numbers with some values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2.3;
        }

        // Calculate and display the average of the array elements
        double sum = 0;
        for(double value : numbers) {
            sum += value;
        }
        double avg = sum / numbers.length;
        System.out.println("Average: " + avg);

    }
}

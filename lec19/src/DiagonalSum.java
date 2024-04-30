public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int primarySum = 0; int secondarySum = 0;

        for (int i = 0; i < matrix.length; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Sum of primary diagonal " + primarySum);
        System.out.println("Sum of secondary diagonal " + secondarySum);
    }
}
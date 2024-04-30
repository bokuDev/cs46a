// Exercise 1: Find the diagonal sum of a 2-D matrix.
public class diagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Diagonal sum: " + diagonalSum(matrix));
    }

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
        }
        return sum;
    }
}

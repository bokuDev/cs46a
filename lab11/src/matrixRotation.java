// Exercise 2: Rotate 2-D matrix 90 degrees clockwise.
public class matrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Display original matrix
        System.out.println("Original matrix: ");
        displayMatrix(matrix);

        swapRowColumns(matrix); // Step one: swap column with rows
        reverseRows(matrix); // Step two: Reverse the elements of each row

        // Display the rotated 90 degree matrix
        System.out.println("\nRotated matrix: ");
        displayMatrix(matrix);
    }

    public static void swapRowColumns(int[][] matrix) {
        int[][] tempMatrix = new int[matrix.length][matrix[0].length];
        // Save temporary matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tempMatrix[i][j] = matrix[i][j];
            }
        }

        // Swap row with column values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = tempMatrix[j][i];
            }
        }
    }

    public static void reverseRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = temp;
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class ColumnMaximum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            System.out.println("Maximum of column " + (i + 1) + ": " + max);
        }
    }
}
public class Problem3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        boolean isIdentity = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    isIdentity = false;
                    break;
                }
            }
        }
        System.out.println(isIdentity? "The matrix is an identity matrix." : "The matrix is not an identity matrix.");
    }
}

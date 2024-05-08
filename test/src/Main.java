public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        int[][] matrix = {
                {1, 2, 3, 4,  5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
        };

        print2DArraySpiralOrder(matrix);
    }

    public static void print2DArraySpiralOrder(int[][] array2D) {
        // Note: Math.ceil(x) get the ceiling of x
        for (int spiral = 0; spiral < Math.ceil((array2D.length * 1.0) / 2); spiral++) {
            // System.out.println(Math.ceil((array2D.length * 1.0) / 2));
            int i = spiral;
            int j = spiral;

            // hard code xd
            if (array2D.length % 2 != 0 && spiral == Math.ceil((array2D.length * 1.0) / 2) - 1) {
                System.out.print(array2D[i][j]);
            }

            // Print top spiral except last elem (i stays, j increases)
            for (j = spiral; j < array2D[i].length - spiral - 1; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            // Print right spiral (i increases, j stays)
            for (i = spiral; i < array2D.length - spiral - 1; i++) {
                System.out.print(array2D[i][j] + " ");
            }
            // Print bottom spiral (I stays in last row, j decreases)
            for (j = array2D[i].length - spiral - 1; j > spiral; j--) {
                System.out.print(array2D[i][j] + " ");
            }
            // Print bottom spiral (I decreases, j stays)
            for (i = array2D.length - spiral - 1; i > spiral; i--) {
                System.out.print(array2D[i][j] + " ");
            }
        }

    }
}
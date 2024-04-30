// Exercise 3: 3D Array Manipulations
public class Array3DManipulation {
    public static void main(String[] args) {
        // Declare a 3D array of dimensions 2x3x4
        int[][][] array3D = new int[2][3][4];
        
        // Fill it with sequential integers starting from 1
        int count = 1;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = count;
                    count++;
                }
            }
        }

        // Print out the entire array in a readable format
        display3DArray(array3D);

        // Calculate the average value of all elements in the array
        System.out.println("\nAverage: " + getAvg(array3D));
    }

    public static void display3DArray(int[][][] array3D) {
        System.out.println("Display 3D array:");
        for (int k = 0; k < array3D.length; k++) {
            System.out.println("\nSlice " + (k + 1));
            for (int i = 0; i < array3D[k].length; i++) {
                for (int j = 0; j < array3D[k][i].length; j++) {
                    System.out.print(array3D[k][i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static double getAvg(int[][][] array3D) {
        double sum = 0;
        int n = array3D.length * array3D[0].length * array3D[0][0].length;
        for (int k = 0; k < array3D.length; k++) {
            for (int i = 0; i < array3D[k].length; i++) {
                for (int j = 0; j < array3D[k][i].length; j++) {
                    sum += array3D[k][i][j];
                }
            }
        }
        return sum / n;
    }
}

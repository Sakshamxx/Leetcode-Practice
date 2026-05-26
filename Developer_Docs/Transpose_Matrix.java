package Developer_Docs;

import java.util.Arrays;

public class Transpose_Matrix {

    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int col = matrix[0].length;

        int transpose[][] = new int[col][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < col; j++) {

                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Function to print matrix
    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] result = transpose(matrix);

        System.out.println("\nTranspose Matrix:");
        printMatrix(result);
    }
}
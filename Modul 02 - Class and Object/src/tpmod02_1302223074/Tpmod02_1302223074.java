package tpmod02_1302223074;

import java.util.Scanner;

public class Tpmod02_1302223074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 2; 

        int[][] matrix1 = {
            {3, -2},
            {4, 5}
        };

        int[][] matrix2 = {
            {5, 1},
            {-1, 2}
        };

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        System.out.println("Hasil perkalian:");
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
        printMatrix(resultMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }
}
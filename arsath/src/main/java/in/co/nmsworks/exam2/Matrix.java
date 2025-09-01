package in.co.nmsworks.exam2;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] rotatedMatrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rotatedMatrix[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix.length ; j++) {
                System.out.print(rotatedMatrix[i][j]);
            }
            System.out.println();
        }
    }
}

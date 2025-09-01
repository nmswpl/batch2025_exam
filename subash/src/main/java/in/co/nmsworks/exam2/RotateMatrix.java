package in.co.nmsworks.exam2;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args)
    {
        RotateMatrix rm = new RotateMatrix();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original matrix:");
        System.out.println();
        rm.printMatrix(matrix);

        rm.printRotatedMatrix(matrix);

        System.out.println();
        System.out.println("Matrix after 90-degree clockwise rotation:");
        rm.printMatrix(matrix);
    }

    public void printRotatedMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right)
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
         }
       }

    public  void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val);
            }
            System.out.println();
        }
    }

}




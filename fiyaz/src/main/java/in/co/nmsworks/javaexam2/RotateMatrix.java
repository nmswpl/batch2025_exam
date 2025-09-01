package in.co.nmsworks.javaexam2;


public class RotateMatrix {
    public static void main(String[] args) {

        RotateMatrix rotateMatrix = new RotateMatrix();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateMatrix.rotate90Clockwise(matrix);
        System.out.println("Rotated matrix:");
        rotateMatrix.printMatrix(matrix);
    }

    public void rotate90Clockwise(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val);
            }
            System.out.println();
        }
    }


}

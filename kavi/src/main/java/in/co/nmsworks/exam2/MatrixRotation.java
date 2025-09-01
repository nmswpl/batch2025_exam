package in.co.nmsworks.exam2;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotateClockwise(matrix);

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val);
            }
            System.out.println();
        }
    }

    private static void rotateClockwise(int[][] matrix) {
        int n = matrix.length;

        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}


package in.co.nmsworks.exam2;

public class RotateMatrix {
    public static void main(String[] args) {
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.rotateTheMatrix();
    }

    private void rotateTheMatrix() {
        int[][] givenMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int n = givenMatrix.length;
        int[][] rotate = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotate[j][n - 1 - i] = givenMatrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotate[i][j] + " ");
            }
            System.out.println();
        }
    }
}

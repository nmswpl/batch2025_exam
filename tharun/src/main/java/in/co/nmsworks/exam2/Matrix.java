package in.co.nmsworks.exam2;

/*
Rotate a square matrix by 90 degrees clockwise.
Example:
Input:
123
456
789

Output:
741
852
963
 */

public class Matrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.rotateMatrix();
    }

    private void rotateMatrix() {

        int [][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] output = new  int[input.length][input[0].length];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                output[i][j] = input[(input[i].length -1 ) - j][i];
            }
        }
        for (int[] rowValues : output) {
            for (int value : rowValues) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}

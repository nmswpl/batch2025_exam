package in.co.nmsworks.exam2;

import java.util.Arrays;

public class DegreeRotateMatrix
{
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

      //  System.out.println(Arrays.deepToString(matrix));

        int[][] result = new int[3][3];

        for (int i = 0; i <=2; i++)
        {
            for (int j = 2; j >=0; j--)
            {
                    result[i][j] = matrix[j][i];
            }
        }

        System.out.println(Arrays.deepToString(result));
    }
}

package in.co.nmsworks.Exam2;

import java.util.Scanner;

public class RotateSquareMatrix
{
    public static void main(String[] args)
    {
        RotateSquareMatrix rotateSquareMatrix = new RotateSquareMatrix();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of X and Y for Square Matrix : ");
        int lengthOfXY = scanner.nextInt();
        int[][] matrix = new int[lengthOfXY][lengthOfXY];

        for (int i = 0; i < lengthOfXY; i++)
        {
            for (int j = 0; j < lengthOfXY; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n Entered matraix : ");
        for (int i = 0; i < lengthOfXY; i++)
        {
            for (int j = 0; j < lengthOfXY; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        rotateSquareMatrix.rotateMatrix(matrix);
    }

    private void rotateMatrix(int[][] matrix)
    {
        int lengthXY = matrix.length;
        int[][] rotatedMatrix = new int[lengthXY][lengthXY];
        int ii = 0, jj = 0;
        for (int j = 0; j < lengthXY ; j++)
        {
            for (int i = lengthXY - 1; i >= 0 ; i--)
            {
                rotatedMatrix[ii][jj] = matrix[i][j];
                jj++;
            }
            ii++;
            jj = 0;
        }

        System.out.println("Rotated Matrix ......");
        for (int i = 0; i < lengthXY; i++)
        {
            for (int j = 0; j < lengthXY; j++)
            {
                System.out.print(rotatedMatrix[i][j]);
            }
            System.out.println();
        }


    }
}

package in.co.nmsworks.test2;

public class RotateMatrix
{
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        RotateMatrix rm = new RotateMatrix();

        arr = rm.rotateMatrix(arr);

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int[][] rotateMatrix(int[][] arr)
    {
        int[][] matrix = new int[arr.length][arr[0].length];
        int index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = arr[i].length - 1; j >= 0; j--)
            {
                matrix[i][index++ % arr.length] = arr[j][i];
            }
        }
        return matrix;
    }
}

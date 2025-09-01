/*package in.co.nmsworks.exam2;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {


        // int[][] arr = {{1,2,3} , {4,5,6} ,{ 7,8,9}};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the row ");
        int row = sc.nextInt();
        System.out.println("enter the size of the column");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(arr, col, row);

    }

    private static void rotateMatrix(int[][] arr, int col, int row) {
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = col; j >= 0; j--) {
                    System.out.print(arr[i][col] + " ");
                }
            }
            System.out.println();

        }
    }
}
*/
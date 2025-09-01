package in.co.nmsworks.exam2;

import java.util.Collections;

public class MatrixRotation {

    public static void main(String[] args) {

        MatrixRotation mr = new MatrixRotation();

        mr.printMatrixAfter90DegreeRotation();
    }

    private void printMatrixAfter90DegreeRotation() {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++){
            int k = arr.length-1;
            for (int j = 0; j < arr.length/2; j++){
                temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                k--;
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

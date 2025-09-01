package in.co.nmsworks.exam2;

import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        SquareMatrix matrix = new SquareMatrix();
        matrix.squareMatrix();
    }

    private void squareMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row count : ");
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1;j <= row; j++) {
                if (i == 1 || j == 1 || i == row  || j == row ){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

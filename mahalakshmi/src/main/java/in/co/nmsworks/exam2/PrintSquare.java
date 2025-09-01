package in.co.nmsworks.exam2;

import java.util.Scanner;

public class PrintSquare {
    public static void main(String[] args) {
        PrintSquare ps = new PrintSquare();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square: ");
        int n = sc.nextInt();
        ps.printSquare(n);
    }

    public void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            if(i == 1 || i == n) {
                for (int j = 1; j <= n ; j++) {
                    System.out.print(i);
                }
            }
            else {
                for (int j = 1; j <= n; j++) {
                    if(j == 1 || j == n ) {
                        System.out.print(i);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

package in.co.nmsworks.test;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * (i - 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {

            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * (i - 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

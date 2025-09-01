package in.co.nmsworks.test;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a LIMIT : ");
        int limit = sc.nextInt();

        DiamondPattern dp = new DiamondPattern();
        dp.printPattern(limit);
    }

    private void printPattern(int limit) {

        for (int i = 1; i <= limit; i++) {

            for (int j = limit; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(k);
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }

        for (int i = limit; i > 1; i--) {

            for (int j = limit; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i - 1; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

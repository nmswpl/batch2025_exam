package in.co.nmsworks.exam2;
import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}



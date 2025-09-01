package in.co.nmsworks.test2;

import java.util.Scanner;

public class NumericPattern {
    public static void main(String[] args) {
        NumericPattern np = new NumericPattern();
        np.numberPatternPrint();
    }

    private void numberPatternPrint() {
        System.out.println("Enter the number :");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i == 1 || j == 1) {
                    System.out.print(i);
                } else if (i == (n - 1) || j == (n - 1)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

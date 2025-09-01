package in.co.nmsworks.Exam2;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Square s = new Square();
        s.printSquarePattern();
    }

    private void printSquarePattern() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num = sc.nextInt();
        int num = 5;
        int space = num-2;
        for (int i=1;i<=num;i++)
        {
            for (int k=1;k<=num;k++)
            {
                for (int j=i;j<=space;j++)
                {
                    System.out.print("  ");
                }

                System.out.print(i);
            }
            System.out.println();
        }
    }
}

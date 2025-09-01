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
        for (int i=1;i<=num;i++)
        {
            for (int k=1;k<=num;k++)
            {
                if((i==2 && i+k==num-1))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}

package in.co.nmsworks.test2;

import java.util.Scanner;

public class SquarePattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side Size : ");
        int side = sc.nextInt();
        sc.nextLine();
        SquarePattern sq = new SquarePattern();
        sq.printSquarePattern(side);
    }

    private void printSquarePattern(int side)
    {
        for (int i = 1; i <= side; i++)
        {
            for (int j = 1; j <= side; j++)
            {
                if (i == 1 || i == side)
                {
                    System.out.print(i + " ");
                }
                else
                {
                    if (j == 1 || j == side)
                    {
                        System.out.print(i + " ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}

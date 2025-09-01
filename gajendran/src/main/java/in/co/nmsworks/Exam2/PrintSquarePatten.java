package in.co.nmsworks.Exam2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PrintSquarePatten
{
    public static void main(String[] args)
    {
        PrintSquarePatten printSquarePatten = new PrintSquarePatten();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length for the Patten : ");
        printSquarePatten.createSquarePatten(scanner.nextInt());
    }

    private void createSquarePatten(int length)
    {
        for (int i = 1; i <= length ; i++)
        {
            for (int j = 1; j <= length; j++)
            {
                if (i == 1 || i == length)
                {
                    System.out.print(i);
                }
                else
                {
                    if (j == 1 || j == length)
                    {
                        System.out.print(i);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

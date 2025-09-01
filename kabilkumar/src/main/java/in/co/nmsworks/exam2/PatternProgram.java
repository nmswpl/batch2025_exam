package in.co.nmsworks.exam2;

import java.util.Scanner;

public class PatternProgram
{
    public static void main(String[] args) {
        System.out.println("enter the rows :");
       // Scanner scanner  =new Scanner(System.in);
        //int rows = scanner.nextInt();

        for (int i = 1; i < 5; i++)
        {
                for (int j = 1; j < 5; j++)
                {
                        System.out.print(i);
                }
            System.out.println();
        }
    }
}

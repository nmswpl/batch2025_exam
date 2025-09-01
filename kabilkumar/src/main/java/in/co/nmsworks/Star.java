package in.co.nmsworks;

public class Star
{
    public static void main(String[] args) {
        int numbers =5;
        for (int i = 1; i <= numbers; i++)
        {
            for (int j = 1 ;j <= numbers-i; j++)
            {
               System.out.print(" ");
            }
            for (int k = 1; k <=( 2 * i -1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

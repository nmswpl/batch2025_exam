package in.co.nmsworks.exam2;

public class SquareMatrix
{
    public static void main(String[] args)
    {
        SquareMatrix sqm = new SquareMatrix();
        sqm.printMatrix();
    }

    private void printMatrix()
    {
        int num = 5;
        int k=0;
        for(int i =  1; i <= num; i++)
        {
            for(int j = 1 ; j <= num; j++)
            {
                k=i+1;
                if(i==j || i==num || i==1 || j==num || k==i)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}

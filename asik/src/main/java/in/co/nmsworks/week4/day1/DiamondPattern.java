package in.co.nmsworks.week4.day1;

public class DiamondPattern
{
    public static void main(String[] args)
    {
        DiamondPattern diamondPattern = new DiamondPattern();

        int n = 4;
        diamondPattern.printDiamontPattern(n);
    }

    private void printDiamontPattern(int n)
    {
        int i, j, k;
        for (i = 1; i <= n; i++)
        {
            for (int space = n - i; space >= 1; space--)
            {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            for (k = j - 2; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        for (i = 1; i <= n; i++)
        {
            for (int space = 1; space <= i; space++)
            {
                System.out.print("  ");
            }
            for (j = 1; j <= n - i; j++)
            {
                System.out.print(j + " ");
            }
            for (k = j - 2; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

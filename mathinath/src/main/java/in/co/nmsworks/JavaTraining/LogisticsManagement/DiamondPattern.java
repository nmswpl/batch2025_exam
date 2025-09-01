package in.co.nmsworks.JavaTraining.LogisticsManagement;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 7;
        int space = n/2;
//        int mid = (n/2)+1;
        int star = 1;
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= space;j++)
            {
                System.out.print("  ");
            }
            for(int k = 1;k <= star;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
//            if(mid>=i)
//            {
//                space--;
//                star++;
//            }
//            else {
//                space++;
//                star--;
//            }

        }
    }
}

package in.co.nmsworks.Exam;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        ArmstrongNumber asm = new ArmstrongNumber();
        asm.isArmstrongNumber(10);

    }

    private void isArmstrongNumber(int num)
    {
        double sum;
        int noOfIteration=0;
        for(int i=10;;i++)
        {
            sum=0;
            int count=0;
            int temp1=i;
            int temp2=i;
            while(temp1>0)
            {
                int rem=temp1%10;
                count++;
                temp1=temp1/10;
            }
            while(temp2>0)
            {
                int rem1=temp2%10;
                sum=sum+Math.pow(rem1,count);
                temp2=temp2/10;
            }
            if(sum==i)
            {
                noOfIteration++;
                System.out.println(i);
            }
            if(noOfIteration==num)
                break;
        }

    }

}


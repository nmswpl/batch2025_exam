package in.co.nmsworks.Exam;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        ArmstrongNumber asm = new ArmstrongNumber();
        asm.isArmstrongNumber(7);

    }
    public boolean isArmstrongNumber(int num)
    {
        int count=0;
        int rem=0;
        int sum;
        int temp2,temp1;
        int noOfIteration=0;
        for(int i=877;;i++)
        {
            sum=1;

            temp1 = i;
            temp2=i;

            while(i>0)
            {
                rem = i % 10;
                i= i / 10;
                count++;
            }
            int rem1=0;
            while(temp1>0)
            {
                rem1 = temp1%10;
                for (int j = 0; j <=count; j++)
                {
                    sum=sum*(rem1*rem1);
                }

                temp1=temp1/10;
                System.out.println(temp1);
            }

            if(sum==temp2)
            {
                System.out.println(temp2);
            }
            noOfIteration++;
            if(noOfIteration==num)
                break;
        }
        return true;
    }
}

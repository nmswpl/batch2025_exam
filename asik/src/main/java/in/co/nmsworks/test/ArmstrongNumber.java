package in.co.nmsworks.test;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();

        for (int i = 1; i <= 10; i++)
        {
            boolean isArmstrongNumber = armstrongNumber.checkArmstrongNumber(i);

            if (isArmstrongNumber)
            {
                System.out.println(i + " Is An Armstrong Number");
            }
            else
            {
                System.out.println(i + " Is Not An Armstrong Number");
            }
        }
    }

    private boolean checkArmstrongNumber(int num)
    {
        int len = String.valueOf(num).length();
        int n = num;
        int sum = 0;
        while (n > 0)
        {
            int digit = n % 10;
            int pow = (int) Math.pow(digit, len);
            sum += pow;
            n = n/10;
        }

        return num == sum;
    }
}

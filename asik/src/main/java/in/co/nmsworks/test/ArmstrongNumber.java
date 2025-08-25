package in.co.nmsworks.test;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();

        int num = 123;

        boolean isArmstrongNumber = armstrongNumber.checkArmstrongNumber(num);

        if (isArmstrongNumber)
        {
            System.out.println(num + " Is An Armstrong Number");
        }
        else
        {
            System.out.println(num + " Is Not An Armstrong Number");
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

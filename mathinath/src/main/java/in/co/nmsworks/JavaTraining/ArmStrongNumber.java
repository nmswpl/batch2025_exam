package in.co.nmsworks.JavaTraining;

public class ArmStrongNumber {
    public static void main(String[] args) {
        ArmStrongNumber asn = new ArmStrongNumber();
        if(asn.isArmStrongNumber(123))
        {
            System.out.println("ArmStrnong number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
    }

    public boolean  isArmStrongNumber(int n) {
        int originalNumber = n;
        int num = n;
        int num1 = n;
        int count = 0;
        while(num1 > 0)
        {
            int rem = num1 % 10;
            count++;
            num1 = num1 / 10;
        }
        int sum = 0;
        while(num>0)
        {
            int mulnum = 0;
            int digit = num % 10;
            for(int i = 1;i<=count;i++)
            {
                mulnum = digit * count;
            }
            sum = sum + mulnum;
            num = num /10;
        }
        return sum == originalNumber;
    }
}

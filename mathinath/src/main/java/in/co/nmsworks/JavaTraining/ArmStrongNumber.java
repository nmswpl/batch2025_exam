package in.co.nmsworks.JavaTraining;

public class ArmStrongNumber {
    public static void main(String[] args) {
        ArmStrongNumber asn = new ArmStrongNumber();
        int count = 0;
        for (int i = 10; i < 10000; i++)
        {
            if (asn.isArmStrongNumber(i))
            {
                count++;
                System.out.println(i + " ");
            }
        }
        System.out.println("The "+count+" armstrong numbers are :");
    }

    public boolean isArmStrongNumber(int n) {
        int originalNumber = n;
        int temp = n;
        int count = 0;
        int sum = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power * digit;
            }
            sum += power;
            temp = temp / 10;
        }
        return sum == originalNumber;
    }
}

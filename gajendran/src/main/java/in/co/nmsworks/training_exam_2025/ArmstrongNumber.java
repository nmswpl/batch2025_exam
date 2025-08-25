package in.co.nmsworks.training_exam_2025;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int countOfArmstrongNumber = 0;
        int i = 10;

        while (countOfArmstrongNumber < 7)
        {
            if (findIsArmstrongNumber(i))
            {
                countOfArmstrongNumber++;
            }
            i++;
        }
    }

    private static boolean findIsArmstrongNumber(int i)
    {
        int temp = i, dig = 0;
        while (temp > 0)
        {
            temp /= 10;
            dig++;
        }
        temp = i;
        int sum = 0;
        while (temp > 0)
        {
            int rem = temp % 10;
            temp /= 10;
            sum += Math.pow(rem,dig);
            System.out.println(sum);
        }

        if (sum == i)
        {
            System.out.println(i);
            return true;
        }

        return false;
    }
}

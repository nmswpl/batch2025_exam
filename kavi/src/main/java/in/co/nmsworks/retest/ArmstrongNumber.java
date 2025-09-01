package in.co.nmsworks.retest;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 0;

        System.out.println("First 7 Armstrong numbers");

        while (count < 7) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}



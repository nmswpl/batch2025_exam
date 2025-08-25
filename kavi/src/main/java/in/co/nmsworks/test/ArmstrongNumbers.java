package in.co.nmsworks.test;
public class ArmstrongNumbers {
    public static int power(int base, int exponent) {
        int result = 1;
        for(int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static boolean isArmstrong(int number) {
        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 10;


        System.out.println("[Armstrong Number");
        System.out.println("   ");

        while (count < 7) {
            if (isArmstrong(number)) {
                System.out.printf(" "+count + 1, number);
                count++;
            }
            number++;
        }
    }
}

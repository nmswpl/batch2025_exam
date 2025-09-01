package in.co.nmsworks.test;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 10;
        int j = 0;
        ArmstrongNumber an = new ArmstrongNumber();
        while (j < 7) {
            boolean isArmstrong = an.isArmstrongNumber(num);
            if (isArmstrong) {
                System.out.println("This is an armstrong number :" + num);
                j++;
            }
            num++;
        }
    }

    private boolean isArmstrongNumber(int num) {

        int number = num;
        double digit;
        double sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + Math.pow(digit, 3);
            number = number / 10;

        }
        return sum == num;
    }
}

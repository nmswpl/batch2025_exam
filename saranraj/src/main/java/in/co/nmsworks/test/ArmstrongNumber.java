package in.co.nmsworks.test;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber am = new ArmstrongNumber();
        am.findArmstrongNumber();
    }

    private void findArmstrongNumber() {
        int n = 17;

        for (int i = 10; i < n; i++) {
            if (isArmStrongNumber(i)) {
                System.out.println("The ArmStrong Number :" + i);
            } else {
                System.out.println("Not an ArmStrong Number");
            }
        }
    }

    private boolean isArmStrongNumber(int num) {

        int power = String.valueOf(num).length();
        int original = num;

        int armStrongNumber = 0;
        while (num != 0) {
            int digit = num % 10;
            armStrongNumber += Math.pow(digit, power);
            num /= 10;
        }
        if (original != armStrongNumber) {
            return false;
        }
        return true;
    }
}

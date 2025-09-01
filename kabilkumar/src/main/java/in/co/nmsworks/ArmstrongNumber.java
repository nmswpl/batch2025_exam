package in.co.nmsworks;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber aMN = new ArmstrongNumber();
        int n = 10;
        int j = 0;
        while (j <= 7) {
            boolean sum = aMN.findArmstrongNumber(n);
            if (sum) {
                System.out.println(n);
                j++;
            }
            n++;
        }
    }

    public boolean findArmstrongNumber(int n) {
        int number = n;
        double digits;
        double sum = 0;
        while (number < 0) {
            digits = number % 10;
            sum = sum + Math.pow(digits, 3);
            number = number / 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}

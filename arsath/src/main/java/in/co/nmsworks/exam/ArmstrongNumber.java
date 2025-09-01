package in.co.nmsworks.exam;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber a = new ArmstrongNumber();
        int count = 0;
        int n = 10;
        while (count < 7) {
            if (a.isArmstrongNumber(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }

    public boolean isArmstrongNumber(int n) {
        int num = n;
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, 3);
            num /= 10;
        }

        return sum == n;
    }
}


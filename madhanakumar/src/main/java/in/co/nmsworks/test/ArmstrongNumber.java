package in.co.nmsworks.test;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        for (int i = 10; i <= 10000; i++) {
            armstrongNumber.isArmstrongNumber(i);
        }
    }

    private boolean isArmstrongNumber(int i) {
        int res = i;
        int temp = i;
        double num;
        int sum = 0;
        double count = 0;
        while (temp > 0){
            count++;
            temp = temp /10;
        }

        while (i > 0){
            num = i % 10;
            sum = (int) (sum + Math.pow(num,count));
            i = i / 10;
        }

        if(res == sum){
            System.out.println(res+" is an Armstrong Number..");
            return true;
        }
        return false;
    }
}
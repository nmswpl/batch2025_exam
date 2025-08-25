package in.co.nmsworks.exam;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber a = new ArmstrongNumber();
        a.printArmstrongNumber(125);
    }

    public void printArmstrongNumber(int n){
        int sum = 0;
        for(int i = 10; i<=100; i++){
            int lastDigit = n / 10;
            sum += (int)Math.pow(lastDigit,3);
            System.out.println(sum);
            n/=10;
        }
    }
}

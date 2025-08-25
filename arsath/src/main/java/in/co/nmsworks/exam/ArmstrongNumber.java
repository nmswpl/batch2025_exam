package in.co.nmsworks.exam;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber a = new ArmstrongNumber();
        a.printArmstrongNumber(125);
    }

    public void printArmstrongNumber(int n){
        int sum = 0;
        int sumOfCubes = 0;
        for(int i = 10; i<=100; i++){
            int lastDigit = n % 10;
            sum += lastDigit;
            sumOfCubes += Math.pow(lastDigit,3);
            n/=10;
        }
        if(sum==sumOfCubes){
            System.out.println(n + " is a Armstrong Number");
        }
        else {
            System.out.println("Not an ARmsrong Nmber");
        }
    }
}

package in.co.nmsworks.test;

public class ArmstrongNumber {

    public static void main(String[] args) {

        ArmstrongNumber an = new ArmstrongNumber();
        an.printFirstSevenArmstrongNumber();
    }

    private void printFirstSevenArmstrongNumber() {

        System.out.println("FIRST SEVEN ARMSTRONG NUMBERS : ");
        int count = 0;
        for (int i = 10; i <= 10000; i++){
            int num = i;
            int number = i;
            int no_of_digits = 0;
            int sum = 0;
            if(count == 7){
                break;
            }
            while (number > 0) {
                number /= 10;
                no_of_digits++;
            }
            while (num > 0){
                int rem = num % 10;
                sum += Math.pow(rem,no_of_digits);
                num /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}

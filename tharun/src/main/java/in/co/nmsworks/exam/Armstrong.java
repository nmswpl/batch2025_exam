package in.co.nmsworks.exam;

public class Armstrong {
    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        int number = 10;
        int count = 0;
        for (int i = number; i < 100000; i++) {

            boolean check = armstrong.isArmstrongNumber(i);

            if (check){
                System.out.println(i+" is  Armstrong");
                count ++ ;
            }
            if (count == 7){
                break;
            }
        }
    }

    private boolean isArmstrongNumber(int number) {
        int baseNumber = number;
        int sum = 0;
        int power =2;
        if (number > 100 && number < 1000){
            power = 3;
        } else if (number > 1000 && number < 10000) {
            power = 4;
        } else if (number > 100000 && number < 100000) {
            power = 5;
        }

        while (number > 0){
            int base = number % 10;
            sum += Math.pow(base,power);
            number = number /10;
        }
        if (baseNumber == sum){
            return true;
        }
        return false ;
    }
}

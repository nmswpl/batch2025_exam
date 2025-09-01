package in.co.nmsworks.test;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    public static void main(String[] args) {

        ArmstrongNumber an = new ArmstrongNumber();

        int count = 1;
        int number = 10;
        List<Integer> armstrongNumberList = new ArrayList<>();
        List<Integer> nonArmstrongNumberList = new ArrayList<>();
        while (count <= 7){
            if (an.isArmstrongNumber(number)){
                armstrongNumberList.add(number);
                count++;
            }
            else{
                nonArmstrongNumberList.add(number);
            }
            number++;
        }
        System.out.println("ARMSTRONG NUMBERS ARE \n" + armstrongNumberList);
        System.out.println("NON ARMSTRONG NUMBERS ARE \n" + nonArmstrongNumberList);
    }

    private boolean isArmstrongNumber(int i) {

        int num = i;
        int number = i;
        int no_of_digits = 0;
        int sum = 0;
        while (number > 0) {
            number /= 10;
            no_of_digits++;
        }
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, no_of_digits);
            num /= 10;
        }
        if (sum == i) {
            return true;
        }
        return false;
    }
}

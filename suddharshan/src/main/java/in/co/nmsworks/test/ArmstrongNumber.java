package in.co.nmsworks.test;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        List<Long> armstrongNos = new ArrayList<>();
        ArmstrongNumber arm = new ArmstrongNumber();
        long number = 10;
        while(armstrongNos.size() != 7){
            boolean res = arm.isArmstrongNumber(number);
            if(res){
               armstrongNos.add(number);
            }
            number++;
        }
        System.out.println(armstrongNos);
    }
    public boolean isArmstrongNumber(long num){
        int sum = 0;
        long copyNum = num;
        while(num != 0){
            long rem = num % 10;
            sum += (rem * rem * rem);
            num = num / 10;
        }
        if(sum == copyNum){
            return true;
        }
        else{
            return false;
        }
    }
}

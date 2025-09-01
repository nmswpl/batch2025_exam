package in.co.nmsworks.test;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        List<Integer> armstrongNos = new ArrayList<>();
        ArmstrongNumber arm = new ArmstrongNumber();
        int number = 10;
        while(armstrongNos.size() != 7){
            boolean res = arm.isArmstrongNumber(number);
            if(res){
               armstrongNos.add(number);
            }
            number++;
        }
        System.out.println(armstrongNos);
    }
    public boolean isArmstrongNumber(int num){
        int sum = 0;
        int copyNum = num;
        while(num != 0){
            int rem = num % 10;
            sum += (int) Math.pow(rem,String.valueOf(copyNum).length());
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

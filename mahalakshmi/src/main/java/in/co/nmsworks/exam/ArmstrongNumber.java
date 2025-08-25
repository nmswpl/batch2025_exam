package in.co.nmsworks.exam;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    public static void main(String[] args) {
        ArmstrongNumber aNum = new ArmstrongNumber();
        List<Integer> numList = new ArrayList<>();
        for(int i = 10 ; i <= 1000 ; i++) {
            if(aNum.isArmstringNumber(i)) {
                numList.add(i);
            }
        }
        System.out.println("The first 7 Armstrong Numbers are: " + numList);
    }

    public boolean isArmstringNumber(int num) {
        int copy = num;
        int result = 0;
        while(num != 0) {
            int unit = num % 10;
            result += (int) Math.pow(unit,3);
            num /= 10;
        }
        if(copy == result) {
            return true;
        }
        return false;
    }
}

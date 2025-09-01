package in.co.nmsworks.revise;

import java.util.ArrayList;
import java.util.List;

public class ArmStrongNumber {


    public static void main(String[] args) {
        ArmStrongNumber aNum = new ArmStrongNumber();
        aNum.printArmstrong(7);
    }

    private void printArmstrong(int n) {
        int i = 1;
        int start = 10;
        while(i <= n) {
            if(isArmstrongNumber(start)) {
                System.out.println(start + "\t");
                i++;
            }
            start++;
        }
    }

    public boolean isArmstrongNumber(int num) {
        int copy = num;
        int res = 0;
        while (num != 0) {
            int unit = num % 10;
            res += (int) Math.pow(unit,countDigit(copy));
            num /= 10;
        }
        if(copy == res) {
            return true;
        }
        return false;
    }

    private int countDigit(int num) {
        int count = 0;
        while(num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}

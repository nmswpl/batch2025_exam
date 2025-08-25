package in.co.nmsworks;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber aMN = new ArmstrongNumber();
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        aMN.findArmstrongNumber(number);


    }

    public void findArmstrongNumber(int[] findArmstrong) {
        double rem = 1;
        int sum = 0;
        for (int i = findArmstrong.length - 1; i >= 0; i--) {
            rem = findArmstrong[i];
            sum += (int) Math.pow(3, rem);

        }
        if (findArmstrong.equals(sum)) {
            System.out.println("thsi is Armstrong number : " + findArmstrong);
        } else {
            System.out.println("the amstrong of first 10 numbers is not armstrong :" + sum);
        }

    }


}

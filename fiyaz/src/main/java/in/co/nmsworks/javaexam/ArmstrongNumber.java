package in.co.nmsworks.javaexam;

public class ArmstrongNumber {

    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();

        armstrongNumber.isArmstrongNumber(1000);
    }

    public void isArmstrongNumber(int num) {


        for (int i = 100; i < num; i++) {

            int count = findCount(i);
            int temp = 0;
            int total = 0;

            int j = 0;
            while (i > 0) {
                temp = i % 10;
                i = i / 10;

                total = total + (temp * temp * temp);
                j++;
            }

            if (total==i) {
                System.out.println(i);
            }

        }
    }

    private int findCount(int num) {
        int count = 0;
        int i =0;
        while (num > 0) {
            num = num/10;
            count = count + 1;
            i++;
        }
        return count;
    }

}

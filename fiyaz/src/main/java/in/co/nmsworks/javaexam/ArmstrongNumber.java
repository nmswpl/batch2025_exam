package in.co.nmsworks.javaexam;

public class ArmstrongNumber {

    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();

        armstrongNumber.isArmstrongNumber(1000);
    }

    public void isArmstrongNumber(int num) {


        for (int i = 10; i < num; i++) {

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

            if (total == i) {
                System.out.println(i);
            }

        }
    }

    private int findCount(int num) {
        int count = 0;
        int i = 0;
        while (num > 0) {
            num = num / 10;
            count = count + 1;
            i++;
        }
        return count;
    }
}





//
//public class ArmstrongNumber {
//
//    public static void main(String[] args) {
//        int count = 0;
//        int num = 10;
//
//        while (count < 7) {
//            if (isArmstrongNumber(num)) {
//                System.out.println(num);
//                count++;
//            }
//            num++;
//        }
//    }
//
//    public static boolean isArmstrongNumber(int num) {
//        int original = num;
//        int digits = String.valueOf(num).length();
//        int sum = 0;
//
//        while (num > 0) {
//            int d = num % 10;
//            sum += Math.pow(d, digits);
//            num /= 10;
//        }
//        return sum == original;
//    }
//}
//

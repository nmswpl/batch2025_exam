package in.co.nmsworks;

public class ArmstrongNumber {

    public boolean isArmstrongNumber(int num){

        num = 123;
        int reversed = 0;

        int found=123;
        int digit=3;
        for(int i=10;i<150;i++){

            digit=num%10;

            reversed+=(reversed*0)+digit;
            num=num/10;
            num= (int) Math.pow(digit,reversed);
            System.out.println(i);
        }
        if(num==found){
            System.out.println("Armstrong Number : " +num);

        }
        else {
            System.out.println("it is not a armstrong number : "+num);

        }

        return isArmstrongNumber(num);
    }

    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber=new ArmstrongNumber();
//        armstrongNumber.isArmstrongNumber(153);


    }
}

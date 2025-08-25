package in.co.nmsworks.Test;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber e=new ArmstrongNumber();
        e.printArmstrongnmbers();

    }

    public  int count(int number){
        int count=0;
        int temp=number;
        while(temp>0) {
            int digit=temp%10;
            count++;
            temp=temp/10;
        }
        return count;
    }

    public boolean isArmstrong(int number){
        int temp=number;
        int result=0;
        int count=0;
        while(temp>0){
            int digits=temp%10;
            result+=Math.pow(digits,count(number));
            temp=temp/10;
        }

        if(result==number){
            return true;
        }
        return false;
    }

    public void printArmstrongnmbers(){
        int count=0;
        for(int i=10;;i++){
            if(isArmstrong(i)){
                System.out.println(i+" ");
                count++;
                if(count==7){
                    break;
                }
            }
        }
    }
}

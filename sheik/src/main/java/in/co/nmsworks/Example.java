package in.co.nmsworks;

public class Example
{
    public static void main(String[] args) {
        int num = 1524;
        int temp = num;
        int len= String.valueOf(num).length();
        System.out.println(len);
        int sum =0 ;

        while(temp>0){
            int rem = temp%10;
            sum = (int) (Math.pow(rem,len) + sum);
            temp = temp/10;
        }

        if(sum==num){
            System.out.println(num);
            System.out.println("Amstrong");
        }
        else{
            System.out.println(num);
            System.out.println("not");
        }
    }
}

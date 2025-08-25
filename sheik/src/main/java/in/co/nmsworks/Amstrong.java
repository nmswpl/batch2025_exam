package in.co.nmsworks;

public class Amstrong
{
    public static void main(String[] args) {
        int num = 10;
        Amstrong am = new Amstrong();
        for (int i = 10; i < 1000; i++) {
            boolean res = am.isAmsrtongNumber(i);
            if (res) {
                System.out.println(i + "is a Amstrong NUmber");
            }

        }
    }

    public boolean isAmsrtongNumber(int num){
        int cube =0;
        int count =0;
        int digitcount = 0;
        int org = num;
        int j =num;
            while(j>0){
                int rem = j/10;
                digitcount++;
            }
            while(num>0){
                int rem = num % 10;
                cube = (int) (Math.pow(rem,digitcount) + cube);
            }
            if(org == cube){
                count++;
                return true;
            }
        return false;
    }
    }


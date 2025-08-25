package in.co.nmsworks.exam;

public class Armstrong {
    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        int number = 10;
        if (armstrong.isisArmstrongNumber(number)){
            System.out.println(number+" is  Armstrong");
        }
        else{
            System.out.println(number+" is  not Armstrong");

        }
    }

    private boolean isisArmstrongNumber(int number) {
        int sum = 0;

        while (number > 0){
            sum += Math.pow((number % 10),2);
            System.out.println(sum);
            number = number /10;
        }
        if (number == sum){
            return true;
        }
        return false ;
    }
}

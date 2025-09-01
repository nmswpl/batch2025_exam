import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        //  int[] numbers = {1,2,3,4,5,6,7,8};
        //  System.out.println("enter the number :");
        // Scanner scanner = new Scanner(System.in);
        // int getNumber = scanner.nextInt();
        int number = 10;
        findPrimeNumbers(number);
    }

    public static void findPrimeNumbers(int numberUpToFind) {
        int count = 0;
        int num = 2;
        while(count < numberUpToFind) {
            boolean isprime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isprime = false;
                }
            }
            if (isprime) {
                System.out.println(num + " ");
                count++;
            }
            num++;
        }
    }
}

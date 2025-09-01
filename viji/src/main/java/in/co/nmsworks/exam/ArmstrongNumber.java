package in.co.nmsworks.exam;

import java.util.Scanner;

/* . Implement the following method. [5 Marks]
public boolean isArmstrongNumber(int num)
Use the above method to find the first 7 Armstrong numbers.
Definition Of Armstrong Number
A number is an Armstrong number, when you break it into its digits, raise each digit to the power of the total
number of digits, and then sum them up. The result should be equal to the original number.
Example:
Consider the number 123. Now, let's check if it satisfies the Armstrong condition:
• 123 has 3 digits.
• For each digit, we raise it to the power of 3 (since there are 3 digits):
▪ (1^3 = 1)
▪ (2^3 = 8)
▪ (3^3 = 27)
Now, we sum these results: [ 1 + 8 + 27 = 36 ]
But the original number 123 is not equal to 36. So, 123 is not an Armstrong number. */
public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 10 ;
        int count = 0;
        while(count < 7){
           boolean answer =  isArmstrongNumber(number);
            if(answer){
                System.out.println(number + " ");
                count++;
            }
            number++;
        }

    }

    public static boolean  isArmstrongNumber(int number){
        int original = number ;
        int countOfDigits = String.valueOf(number).length();
        int sum = 0;
            while (number > 0) {
                int remainder = number % 10;
                sum += Math.pow(remainder, countOfDigits);
                number = number / 10;
            }
       if(original == sum ){
           return true;
       }
       else
           return false;
    }
}

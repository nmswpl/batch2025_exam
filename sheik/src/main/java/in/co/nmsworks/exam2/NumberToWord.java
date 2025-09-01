package in.co.nmsworks.exam2;

import java.util.Scanner;

public class NumberToWord
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = sc.nextInt();

        System.out.println(numberToWord(number));


    }
    public static String numberToWord(int number){
        String[] strOnes = {"zero","one", "two" ,"three", "four","five" ,"six","seven" ,"eight" ,"nine","ten"};
        String[] strTens = {"twenty" , "thirty", "fourty","fifty","sixty","seventy","eighty","ninty"};
        String[] place = {"hundred", "thousand"};

        int count = 0;
        int temp = number;
        while(temp>0){
            temp = temp /10;
            count++;
        }

        if(count == 1){
            //System.out.println(strOnes[number]);
            return strOnes[number];
        }
        else if(count ==2){
            int temp1 = number;
            int last = temp1%10;
            int first = temp1/10 ;


            return strTens[first - 2] + " " + strOnes[last];
        }
        else if (count ==3){
            int temp2 = number;

            int last = temp2%10;
            int sec = temp2/10;
            sec = sec % 10;
            int first = temp2/100;

            return strOnes[first] + " " + place[0] + " " + strTens[sec - 2] + " " + strOnes[last];
        }

        else if (count ==4){
            int temp3 = number;

            //int last = temp3%10;
            int mid = temp3%1000;
            int first = temp3/1000;

            String str = numberToWord(mid);
            return strOnes[first] + " " + place[1] + " " + str;
        }
        else if (count ==5){
            int temp3 = number;

            int last = temp3%100;
            last = last%10;
            int mid = temp3%10000;
            int first = temp3/10000;

            String str = numberToWord(mid);
            return strTens[first-2]  + " " + str;
        }

        return "";
    }
}

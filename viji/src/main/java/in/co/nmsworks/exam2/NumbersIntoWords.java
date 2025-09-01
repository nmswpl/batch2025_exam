package in.co.nmsworks.exam2;

import java.util.Scanner;

public class NumbersIntoWords {
    public static void main(String[] args) {

        NumbersIntoWords nw = new NumbersIntoWords();
        System.out.println("enter the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nw.convertingToWords(n);
    }

    private void convertingToWords(int n) {
        String output = "";
        int number  = n ;
        while (n > 0) {
            int rem = n % 10;
            switch (rem) {
                case 1:
                    output = "One "+output;
                    break;
                case 2:
                    output = "Two "+output ;
                    break;
                case 3:
                    output ="Three "+output;
                    break;
                case 4:
                    output ="Four "+output;
                    break;
                case 5:
                    output ="Five "+output;
                    break;
                case 6:
                    output ="Six "+output;
                    break;
                case 7:
                    output ="seven "+output;
                    break;
                case 8:
                    output ="Eight " +output;
                    break;
                case 9:
                    output ="Nine"+output;
                    break;
            }

            n = n/10;
        }
        System.out.println("The words of this number " +number +" is " + output);
    }
}

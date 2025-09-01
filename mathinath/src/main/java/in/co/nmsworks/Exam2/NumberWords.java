package in.co.nmsworks.Exam2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        NumberWords nw = new NumberWords();
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        nw.printNumberToWords(num);
    }

    private void printNumberToWords(int num) {
        if(num>0 && num<=99999)
        {
           String str = String.valueOf(num);
//           String words = str.
        }
    }
}

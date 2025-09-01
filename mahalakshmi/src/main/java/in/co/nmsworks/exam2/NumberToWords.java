package in.co.nmsworks.exam2;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        NumberToWords nm = new NumberToWords();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert: ");
        int n = sc.nextInt();
        nm.numberToText(n);
    }

    public String onesString(int i) {
        String[] ones = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        return ones[i];
    }

    public String tensString(int i) {
        String[] tens = {"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        return tens[i];
    }

    public void numberToText(int n) {
        int onesNum = 0,tensNum = 0;
        int HunNum = 0,thousandsNum = 0, tenThousandNum = 0;
        String res = "";
        if(n < 10) {
            res = onesString(n);
        }

        if(n == 10) {
            System.out.println("Ten");
        }

        else if(n >= 11 && n <= 19) {
            String[] elevenToNinetten = {"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sexteen","Seventeen","Eighteen","Nineteen"};
            int index = n % 10;
            System.out.println(elevenToNinetten[index-1]);
        }

        else if(n >= 20 && n <= 99999) {
            while(n != 0) {
                int rem = n % 10;
                n /= 100;
                res = res + tensString(rem);
            }

        }
        System.out.println(res);
    }
}

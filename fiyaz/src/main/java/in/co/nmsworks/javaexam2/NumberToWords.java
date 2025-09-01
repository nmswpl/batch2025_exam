package in.co.nmsworks.javaexam2;


import java.util.Scanner;

public class NumberToWords {


    String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    String[] tens = {
            "", "","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };


    public static void main(String[] args) {

        NumberToWords numberToWords = new NumberToWords();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 0 to 99999 :: ");
        int num = scanner.nextInt();

        String words = numberToWords.convert(num);
        System.out.println("In words: " + words);
    }



    public String convert(int num) {
        if (num == 0) {
            return "Zero";
        }

        if (num < 0 || num > 99999) {
            return "Number out of range (0-99999)";
        }

        StringBuilder result = new StringBuilder();

        if (num >= 1000) {
            int thousands = num / 1000;
            result.append(convertThousand(thousands)).append(" Thousand ");
            num %= 1000;
        }

        if (num > 0) {
            result.append(convertThousand(num));
        }

        return result.toString();
    }


    public String convertThousand(int num) {
        StringBuilder result = new StringBuilder();

        if (num >= 100) {
            result.append(units[num / 100]).append(" Hundred ");
            num %= 100;
        }

        if (num > 0) {
            if (num < 20) {
                result.append(units[num]).append(" ");
            } else {
                result.append(tens[num / 10]).append(" ");
                if (num % 10 != 0) {
                    result.append(units[num % 10]).append(" ");
                }
            }
        }

        return result.toString();
    }


}



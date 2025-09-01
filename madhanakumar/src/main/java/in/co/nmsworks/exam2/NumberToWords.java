package in.co.nmsworks.exam2;

import java.util.Scanner;

public class NumberToWords {
    String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        scan.close();
        System.out.println(num + " => " + convert(num));
    }
    public static String convert(int num) {
        if (num == 0)
            return "Zero";
        NumberToWords numberToWords = new NumberToWords();
        return numberToWords.printNumberToWords(num).trim();
    }
    private String printNumberToWords(int num) {
        String result = "";
        if (num < 20) {
            result = belowTwenty[num];
        } else if (num < 100) {
            result = tens[num / 10] + " " + belowTwenty[num % 10];
        } else if (num < 1000) {
            result = belowTwenty[num / 100] + " Hundred and " + printNumberToWords(num % 100);
        } else if (num < 100000) {
            result = printNumberToWords(num / 1000) + " Thousand " + printNumberToWords(num % 1000);
        }
        return result.trim();
    }
}

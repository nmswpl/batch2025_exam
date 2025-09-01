package in.co.nmsworks.exam2;

import java.util.Scanner;

public class NumberToDigit
{
      String[] ones = {
            "", "One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
    };

     String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"
    };


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (up to 5 digits): ");
        NumberToDigit ntd = new NumberToDigit();
        int number = sc.nextInt();
        String word = ntd.convertToWords(number);
        System.out.println(word);
    }

    public  String convertToWords(int number)
            {
                if (number == 0)
                {
                    return "Zero";
                }

                if (number > 99999)
                {
                    return " 5 digits only capable";
                }

                String words = "";

                if ((number / 1000) > 0)
                {
                    words = words + convertToWords(number / 1000) + " Thousand ";
                    number %= 1000;
                }

                if ((number / 100) > 0)
                {
                    words = words + convertToWords(number / 100) + " Hundred ";
                    number %= 100;
                }

                if (number > 0)
                {
                    if (number < 20)
                    {
                        words = words + ones[number];
                        return words;
                    }
                    else
                    {
                        words = words + tens[number / 10];

                        if ((number % 10) > 0)
                        {
                            words += " " + ones[number % 10];
                            return words;
                        }
                    }
                }

                return words.trim();
            }

        }


package in.co.nmsworks.test2;

public class NumberToWords
{
    public static void main(String[] args)
    {
        int num = 1234;
        String[] ones = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens = {"Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Nighty"};
        String word = "";
        while (num > 0)
        {
            int len = String.valueOf(num).length();
            switch (len)
            {
                case 1:
                    word += ones[Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0))) - 1] + " ";
                    break;
                case 2:
                    word += tens[Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0))) - 1] + " ";
                    break;
                case 3:
                    word += ones[Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0)))-1] + " Hundred ";
                    break;
                case 4:
                    word += ones[Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0)))-1] + " Thousand ";
                    break;
            }
            num = num > 10 ? Integer.parseInt(String.valueOf(num).substring(1)) : 0;
        }
        System.out.println(word);
    }
}

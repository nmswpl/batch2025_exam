package in.co.nmsworks.Exam2;

public class NumberConvertions {
    public static void main(String[] args) {
        int num = 123;
        String numbers = "" + num;
        if (numbers.length() < 2) {
            String number = convert(num);
        }
        else if (numbers.length() == 3){
            int digits = num % 10;
            StringBuffer stringBuffer = new StringBuffer();
            while (digits > 0){
                num = num /10;
                digits = num % 10;
                stringBuffer.append(convert(digits));
            }
        }
    }

    public static String convert(int num) {
        String[] letters = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };
        return letters[num];

    }
}

package in.co.nmsworks.Exam2;

public class NumberConvertions {
    public static void main(String[] args) {
        int num = 123;
        String number = convert(num);
    }
    public static String convert(int num) {
        String[] letters = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };

        if (num >= 0 && num < 20) {
            return letters[num];
        } else {
            return "Number out of range";
        }
    }
}

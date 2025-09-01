package in.co.nmsworks.exam2;

import java.util.*;

public class NumberInWords {

    public static void main(String[] args) {

        NumberInWords n = new NumberInWords();
        n.convertAndPrintNumberInWords();
    }

    private void convertAndPrintNumberInWords() {

        Map<Integer,String> numberMap = new HashMap<>();
        numberMap.put(1,"One");
        numberMap.put(2,"Two");
        numberMap.put(3,"Three");
        numberMap.put(4,"Four");
        numberMap.put(5,"Five");
        numberMap.put(6,"Six");
        numberMap.put(7,"Seven");
        numberMap.put(8,"Eight");
        numberMap.put(9,"Nine");
        numberMap.put(10,"Ten");
        numberMap.put(11,"Eleven");
        numberMap.put(12,"Twelve");
        numberMap.put(20,"Twenty");
        numberMap.put(30,"Thirty");
        numberMap.put(40,"Fourty");
        numberMap.put(50,"Fifty");
        numberMap.put(60,"Sixty");
        numberMap.put(70,"Seventy");
        numberMap.put(80,"Eighty");
        numberMap.put(90,"Ninety");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        String numberInWords = "";

        if (num < 1000 && num >= 0){
            if (num < 10){
                numberInWords += (numberMap.get(num));
            }
            if ((num < 100) && (num >= 10)){
                num = num/10;
                numberInWords += (numberMap.get(num*10));
            }
            if (num > 100) {
                num /= 100;
                numberInWords += (numberMap.get(num) + " hundred");
            }
            num = num%100;
        }
        System.out.println(numberInWords);
    }
}

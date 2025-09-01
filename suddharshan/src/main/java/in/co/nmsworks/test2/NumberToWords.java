package in.co.nmsworks.test2;

public class NumberToWords {
    public static void main(String[] args) {
        NumberToWords ntw = new NumberToWords();
        ntw.getWordsOfNos(27375);
    }
    public void getWordsOfNos(int num){
        StringBuilder str = new StringBuilder();
        String[] arr = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        if(String.valueOf(num).length() == 1){
            str.append(arr[num]);
        }
        else if(String.valueOf(num).length() == 2){
            if(num/10 == 1 && num%10 == 1){
                str.append("Eleven");
            }
            else if(num/10 == 1 && num%10 == 2){
                str.append("Twelve");
            }
            else{
                String ans = arr[num%10] + "teen";
                str.append(ans);
            }
        }
        else if(String.valueOf(num).length() == 3){
            int hundred = num / 100;
            int one = num % 10;
            int ten = Integer.parseInt(String.valueOf(num).substring(1,2));
            String hundredStr = arr[hundred] + " hundred ";
            str.append(hundredStr);
            String tenStr = arr[ten] + "ty ";
            str.append(tenStr);
            str.append(arr[one]);
        }
        else if(String.valueOf(num).length() == 4){
            int thousand = num / 1000;
            int hundred = Integer.parseInt(String.valueOf(num).substring(1,2));
            int one = num % 10;
            int ten = Integer.parseInt(String.valueOf(num).substring(2,3));
            String thousandStr = arr[thousand] + " thousand ";
            str.append(thousandStr);
            String hundredStr = arr[hundred] + " hundred ";
            str.append(hundredStr);
            String tenStr = arr[ten] + "ty ";
            str.append(tenStr);
            str.append(arr[one]);
        }
        else if(String.valueOf(num).length() == 5){
            int lakhs = num / 10000;
            String lakhsStr = arr[lakhs] + " lakhs ";
            str.append(lakhsStr);
            int num1 = Integer.parseInt(String.valueOf(num).substring(1,2));
            String num1Str = arr[num1] + "ty ";
            str.append(num1Str);
            int num2 = Integer.parseInt(String.valueOf(num).substring(2,3));
            String num2Str = arr[num2] + " Thousand ";
            str.append(num2Str);
            int num3 = Integer.parseInt(String.valueOf(num).substring(3,4));
            String num3Str = arr[num3] + " Hundred and ";
            str.append(num3Str);
            str.append(arr[num%10]);
        }
        else{
            System.out.println("Larger Number..");
        }
        System.out.println(str);
    }
}

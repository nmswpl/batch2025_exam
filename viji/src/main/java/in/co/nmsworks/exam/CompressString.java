package in.co.nmsworks.exam;

import java.util.LinkedHashSet;
import java.util.Set;

/* 2. Compress String [5 Marks]
Write a method private String compressString(String input) that takes a string and
compresses it by counting consecutive occurrences of each character. The compressed version should
represent each character by its count followed by the character itself. Think of all the test cases.
For example:
• Input: "aaabbca"
• Output: "3a2b1c1a"*/
public class CompressString {
    public static void main(String[] args) {
        String input = "aaabbca";
        String answer = compressString(input);
        System.out.println(answer);
    }
    private static String compressString(String input){
       String output = "";
       Set<String> set = new LinkedHashSet<>();

        for(int i =0 ; i<input.length () ; i++){
            char ch = input.charAt(i);
            if(input.indexOf(ch)==-1){
                int count = 0;
                count++;
                output = output +ch;
            }

        }
        return output;
    }
}

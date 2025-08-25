package in.co.nmsworks.exam;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 2. Compress String [5 Marks]
 * Write a method private String compressString(String input) that takes a string and
 * compresses it by counting consecutive occurrences of each character. The compressed version should
 * represent each character by its count followed by the character itself. Think of all the test cases.
 * For example:
 * •
 * •
 * Input: "aaabbca"
 * Output: "3a2b1c1a"
 */

public class CompressString {
    public static void main(String[] args) {
        CompressString stringCompress = new CompressString();
        String input = "aaabbca";
        stringCompress.compressString(input);
    }

    private void compressString(String input) {
        char [] charArray = input.toCharArray();
        System.out.println(Arrays.toString(charArray));
        String result = "";
        int count = 1;
        for (int i = 0; i < charArray.length-1;i++) {

            if (charArray[i] == charArray[i+1]){
                count++;
            }
            if (charArray[i] != charArray[i+1]){
                result += String.valueOf(count) + charArray[i];
                count = 1;
            }
        }
        System.out.println(result);
    }
}

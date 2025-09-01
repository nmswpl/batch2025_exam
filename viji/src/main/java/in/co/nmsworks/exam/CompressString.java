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
        System.out.println(compressString(input));
    }

    private static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(input.charAt(i - 1));
                count = 1;
            }

        }
        return sb.toString();
    }
}

package in.co.nmsworks.exam;

import javax.xml.stream.events.Characters;
import java.util.*;

public class StringPattern {
    public static void main(String[] args) {
        StringPattern sp = new StringPattern();
        sp.compressString("aaabbca");
    }

    public String compressString(String input){
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder compressed = new StringBuilder();
        int n = input.length();
        int i = 0;

        while (i < n) {
            char currentChar = input.charAt(i);
            int count = 0;
            int j = i;
            while (j < n && input.charAt(j) == currentChar) {
                count++;
                j++;
            }
            compressed.append(count).append(currentChar);
            i = j;
        }

        System.out.println(compressed);

        return compressed.toString();
    }
}

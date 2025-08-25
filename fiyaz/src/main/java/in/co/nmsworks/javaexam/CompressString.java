package in.co.nmsworks.javaexam;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        CompressString compressString = new CompressString();

        compressString.compTheString("aaabbca");
    }

    private void compTheString(String str) {

        Map<Character,Integer> integerMap = new HashMap<>();

        char[] characters = str.toCharArray();

        for (char c : characters) {
            if(!(integerMap.containsKey(c))) {
                integerMap.put(c,1);
            }
            else if (integerMap.containsKey(c)) {
                integerMap.put(c, integerMap.get(c) + 1);
            }
        }

        String sf = "";
        for (Map.Entry<Character, Integer> characterIntegerEntry : integerMap.entrySet()) {
            sf = sf + characterIntegerEntry.getValue() + characterIntegerEntry.getKey();
        }

        System.out.println(sf);

    }
}

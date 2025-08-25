package in.co.nmsworks;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs = new CompressString();
        String compressData = "aaabbca";
        cs.compressString(compressData);

    }

    private String compressString(String compressData) {
        for (int i = 0; i < compressData.length(); i++) {
            char ch = compressData.charAt(i);
            Map<Character, Integer> freq = new HashMap<>();
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            for (Map.Entry<Character, Integer> characterIntegerEntry : freq.entrySet()) {
                System.out.print(+characterIntegerEntry.getKey() + " " + characterIntegerEntry.getValue());


            }
        }
        return compressData;
    }
}

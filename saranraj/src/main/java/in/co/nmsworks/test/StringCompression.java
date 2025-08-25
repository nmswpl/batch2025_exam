package in.co.nmsworks.test;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        String  str="aaabbca";
        sc.compressString(str);
    }

    private void compressString(String str) {
        char[] ch =str.toCharArray();
        Map<Character,Integer> countFreq = new HashMap<>();
        for (char c :ch) {
            countFreq.put(c,countFreq.getOrDefault(c,1)+1);
        }
        for (Map.Entry<Character,Integer> display : countFreq.entrySet()){
            System.out.println(display.getKey()+""+display.getValue());
        }
    }
}

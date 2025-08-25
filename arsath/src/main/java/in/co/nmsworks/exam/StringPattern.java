package in.co.nmsworks.exam;

import javax.xml.stream.events.Characters;
import java.util.*;

public class StringPattern {
    public static void main(String[] args) {
        StringPattern sp = new StringPattern();
        sp.compressString("aaabbca");
    }

    public void compressString(String s){
        List<Character> characters = new ArrayList<>();
        for(Character ch : s.substring(0,s.length()-1).toCharArray()){
            characters.add(ch);
        }
        System.out.println(characters);

        StringBuilder result = new StringBuilder();
        Map<Character,Integer> charMap = new HashMap<>();

        for (Character character : characters) {
                charMap.put(character,charMap.getOrDefault(character,0)+1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(result);

    }
}

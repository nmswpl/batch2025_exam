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


//public class CompressString {
//    public static void main(String[] args) {
//        System.out.println(compressString("aaabbca"));  // 3a2b1c1a
//        System.out.println(compressString("abc"));      // 1a1b1c
//    }
//
//    private static String compressString(String input) {
//        if (input == null || input.isEmpty()) return "";
//
//        StringBuilder sb = new StringBuilder();
//        int count = 1;
//
//        for (int i = 1; i <= input.length(); i++) {
//            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
//                count++;
//            } else {
//                sb.append(count).append(input.charAt(i - 1));
//                count = 1;
//            }
//        }
//        return sb.toString();
//    }
//}

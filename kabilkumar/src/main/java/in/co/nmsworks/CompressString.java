package in.co.nmsworks;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs = new CompressString();
        String compressData = "aaabbbbca";
        cs.compressString(compressData);

    }
    public  void  compressString(String compressData)
    {
        int count = 1;
        StringBuilder resultStore = new StringBuilder();
        for (int i=0 ;i< compressData.length();i++)
        {
           if (i+1 < compressData.length() && compressData.charAt(i)== compressData.charAt(i+1))
           {
               count ++;
            }
           else {
               resultStore.append(count).append(compressData.charAt(i));
               count = 1;
           }

        }
        System.out.println(resultStore);

    }

//    private String compressString(String compressData) {
//        for (int i = 0; i < compressData.length(); i++) {
//            char ch = compressData.charAt(i);
//            Map<Character, Integer> freq = new HashMap<>();
//            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
//
//            for (Map.Entry<Character, Integer> characterIntegerEntry : freq.entrySet()) {
//                System.out.print(+characterIntegerEntry.getKey() + " " + characterIntegerEntry.getValue());
//            }    }
//
//        return compressData;
//    }

}

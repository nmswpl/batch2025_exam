package in.co.nmsworks.JavaTraining;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs = new CompressString();
        cs.compressString("aaabbca");
    }

    private String compressString(String str) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            String[] str1 = str.split("");
            if(map.containsKey(str1[i]))
            {
                map.put(str1[i],map.get(str1[i])+1);
                System.out.println();
            }
            else
            {
                map.put(str1[i],1);
            }
        }

        System.out.println(map);
        return str;
    }
}

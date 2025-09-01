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

        int count=1;
        StringBuilder compress = new StringBuilder();
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==str.charAt(i+1)){
                count++;
        }else {
                compress.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        compress.append(str.charAt(str.length()-1)).append(count);

        System.out.println(compress);
    }
}

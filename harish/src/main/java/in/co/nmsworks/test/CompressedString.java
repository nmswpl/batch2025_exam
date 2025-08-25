package in.co.nmsworks.test;

import java.util.HashMap;
import java.util.Map;

public class CompressedString {
    public static void main(String[] args) {
        CompressedString cs = new CompressedString();
        String inputString = "aaabbca";
        String compresed = cs.compressString(inputString);

    }

    private String compressString(String inputString) {
        String compress = "";
        for( int i = 0; i < inputString.length();i++ ){
            int count = 0;
            for (int j = 0 ; j < inputString.length(); j++) {
                if(inputString.charAt(i) == inputString.charAt(j)){
                    count ++;
                }
                else if(inputString.charAt(i) != inputString.charAt(j)) {
                    break;
                }
            }
            compress = "" + count + inputString.charAt(i) ;
        }

        System.out.println(compress);
        return compress;
    }
}

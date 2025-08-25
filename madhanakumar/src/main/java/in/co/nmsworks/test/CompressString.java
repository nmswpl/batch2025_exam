package in.co.nmsworks.test;

import java.util.Objects;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs = new CompressString();
        cs.compressString("aaabbca");
    }

    private String compressString(String input) {
        String output = "";
        String [] strings = input.split("");
        for (int i = 0; i < strings.length ; i++){
            int occur = 0;
            for (int j = 1; i < strings.length; i++) {
                if (strings[i].equals(strings[j-1])){
                    occur += 1;
                }
                output += occur+strings[i];
            }
            System.out.println(output);
        }

        return "";
    }
}

package in.co.nmsworks.test;

import java.util.Objects;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs = new CompressString();
        System.out.println(cs.compressString("aabbca"));
    }
    private String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder output = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                output.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }
        output.append(count).append(input.charAt(input.length() - 1));
        return output.toString();
    }
}

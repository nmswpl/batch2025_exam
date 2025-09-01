package in.co.nmsworks.retest;

public class StringCompressor {

    private String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String compressed = "";
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed = compressed + count + input.charAt(i);
                count = 1;
            }
        }

        return compressed;
    }

    public static void main(String[] args) {
        StringCompressor sc = new StringCompressor();

        System.out.println(sc.compressString("aaabbca"));
        System.out.println(sc.compressString("a"));
        System.out.println(sc.compressString("abc"));
        System.out.println(sc.compressString("aaAAaa"));
        System.out.println(sc.compressString("1112233"));
    }
}


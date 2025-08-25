package in.co.nmsworks.test;

public class StringCompressor {

    private String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String result = "";
        char currentChar = input.charAt(0);
        int count = 1;


        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == currentChar) {
                count++;
            } else {
                result = result + count + currentChar;
                currentChar = ch;
                count = 1;
            }
        }


        result = result + count + currentChar;

        return result;
    }


    public static void main(String[] args) {
        StringCompressor sc = new StringCompressor();
        String input = "aaabbca";
        String compressed = sc.compressString(input);
        System.out.println("Input" + input);
        System.out.println("compressed"+compressed);
    }
}


package in.co.nmsworks.revise;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs = new CompressString();
        String str = "aaabbca";
        System.out.println(cs.compressString(str));
    }

    private String compressString(String input) {
        StringBuffer sb = new StringBuffer();
        char[] charArr = input.toCharArray();
        int count = 1;
        if(charArr.length == 0) {
            return null;
        }
        for (int i = 1; i < charArr.length; i++) {
            char c = charArr[i-1];
            if(c == charArr[i]) {
                count++;
            }
            else {
                sb.append(count);
                sb.append(c);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(charArr[charArr.length-1]);
        return sb.toString();
    }
}

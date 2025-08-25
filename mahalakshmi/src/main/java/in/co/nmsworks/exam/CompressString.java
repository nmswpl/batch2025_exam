package in.co.nmsworks.exam;

public class CompressString {

    public static void main(String[] args) {
        CompressString cs = new CompressString();
        String str = "aaabbca";
        System.out.println(cs.compressString(str));

    }
    private String compressString(String input) {
        StringBuffer sb = new StringBuffer();
        int count = 1;
        for(int i = 1 ; i < input.length() ; i++) {
            char c = input.charAt(i-1);
            if(c == input.charAt(i)) {
                count += 1 ;
            }
            else {
                sb.append(count);
                count = 1;
                sb.append(c);
            }
            c+=1;
        }
        sb.append(1);
        sb.append(input.charAt(input.length()-1));
        return sb.toString();
    }
}

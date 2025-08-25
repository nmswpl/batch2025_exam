package in.co.nmsworks;

public class StringCompressor
{
    public static void main(String[] args) {
        String input = "aaabbca";
        StringCompressor sc = new StringCompressor();

        System.out.println(sc.compressString(input));

    }
    private String compressString(String input){
        StringBuffer sb = new StringBuffer();
        int index =0;
        for(int i=0;i<input.length();i=i+index){
            int count = 1;
            while(input.charAt(i) == input.charAt(i+1)){
                count++;
                index++;
            }
            sb.append(count);
            sb.append(input.charAt(i));
        }
        String output = (String) sb;
        return output;
    }
}

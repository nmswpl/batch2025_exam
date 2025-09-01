package in.co.nmsworks.Test;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs=new CompressString();
        System.out.println(cs.compressString("aaabbca"));
    }
    private  String compressString(String input){
        StringBuilder result=new StringBuilder();
        int count = 1;
        char[]ch=input.toCharArray();
        for(int i=1;i<=ch.length-1;i++) {
            if(ch[i]==ch[i-1]){
                count++;
            }
            else{
                result.append(count).append(ch[i-1]);
                count=1;
            }
        }
        count=1;
        result.append(count).append(input.charAt(input.length()-1));
        return result.toString();
    }
}

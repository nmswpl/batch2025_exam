package in.co.nmsworks.Test;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs=new CompressString();
        cs.compressString("aaabbca");

    }

    private  String compressString(String input){
        String result="";
        int count = 0;
        char[]ch=input.toCharArray();
        for(int i=0;i<ch.length;i++) {
            for(int j=0;j<ch.length;j++)
            if(ch[i]==ch[j]){
                count++;
            }
            count=0;
        }
        System.out.println(count);
        return result;
    }



}

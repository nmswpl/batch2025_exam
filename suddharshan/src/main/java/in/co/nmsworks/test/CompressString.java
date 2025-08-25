package in.co.nmsworks.test;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs = new CompressString();
        cs.compressString("aaabbca");
    }
    public void compressString(String str){
        String res = "" ;
        for(int i = 0; i < str.length(); i++){
            Character temp = str.charAt(i);
            int j = i+1;
            while (temp.equals(str.charAt(j))){
                j++;
            }
            res = res + (temp + j);
            i = i+j;
        }
        System.out.println(res);
    }
}

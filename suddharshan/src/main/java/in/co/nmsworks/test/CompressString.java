package in.co.nmsworks.test;

public class CompressString {
    public static void main(String[] args) {
        CompressString cs = new CompressString();
        cs.compressString("aaabbca");
        cs.compressString("");
    }
    public void compressString(String str){
        if(str.isEmpty()){
            System.out.println("String is Empty");
        }  else{
            String res = "";
            int i = 0;
            while(i < str.length()){
                Character temp = str.charAt(i);
                int j = i+1;
                int count = 1;
                while (j < str.length() && temp.equals(str.charAt(j)) ){
                    j++;
                    count++;
                }
                res = res + temp + count;
                i = j;
            }
            System.out.println(res);
        }
    }
}

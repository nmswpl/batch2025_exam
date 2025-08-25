package in.co.nmsworks;

public class CompressString {
    private String compressString(String input){
        String intput=input;
        int countA = 0;

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(input.equals('a')){
                countA +=countA;

            }
//            System.out.println("count of a : "+ input.toString());
       }
        String word=input.replaceFirst("a","3");
        String word2= String.valueOf(input.indexOf(2)).replaceFirst("b","1");


        System.out.println(word);
        System.out.println(word2);

        return null;
    }


    public static void main(String[] args) {
        CompressString compressString=new CompressString();
        compressString.compressString("aaabbca");
    }

}

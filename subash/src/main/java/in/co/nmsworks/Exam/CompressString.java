package in.co.nmsworks.Exam;

public class CompressString
{
    public static void main(String[] args) {
        CompressString cs = new CompressString();

        System.out.println(cs.compressString("aaabbca"));
    }
    private String compressString(String input)
    {

        if(input==null || input.isEmpty())
        {
            return "";
        }
        String merge="";
        int count=1;
        char[] charArray = input.toCharArray();
        for(int i=1;i<charArray.length;i++)
        {
           if(charArray[i-1]==charArray[i])
           {
               count++;
           }
           else
           {
               merge=merge+count+charArray[i-1];
               count=1;
           }

        }
        merge=merge+count+charArray[charArray.length-1];
        return merge;
    }
}

package in.co.nmsworks.training_exam_2025;

import java.util.Scanner;

public class CompressString
{

    private String compressString(String inputString)
    {
        if (inputString.isEmpty() ){
            return "Enter a String to Compress";
        }
        String resultString = "";
        char[] c = inputString.toCharArray();
        char previousString = c[0];
        int count = 1;
        for (int i = 1; i < c.length; i++)
        {
            if (c[i] == previousString)
            {
                count++;
            }else
            {

                resultString += count+""+previousString;
                previousString = c[i];
                count = 1;
            }
        }
        resultString += count+""+previousString;
        return resultString;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String sampleString = "abaaabbbaa.";
        CompressString compressString = new CompressString();

        System.out.println(compressString.compressString(sampleString));

    }
}

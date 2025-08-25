package in.co.nmsworks.training_exam_2025;

public class CompressString
{

    private String compressString(String inputString)
    {
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
        String sampleString = "aaabbca";
        CompressString compressString = new CompressString();

        System.out.println(compressString.compressString(sampleString));

    }
}

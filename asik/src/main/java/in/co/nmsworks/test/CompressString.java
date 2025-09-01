package in.co.nmsworks.test;

public class CompressString
{
    public static void main(String[] args)
    {
        CompressString compressString = new CompressString();

        String str = "aaabbca";

        String result = compressString.compressedString(str.trim());

        System.out.println(result == null ? "Empty String Cannot Be Compressed" : result);

        str = "";

        result = compressString.compressedString(str.trim());

        System.out.println(result == null ? "Empty String Cannot Be Compressed" : result);
    }

    private String compressedString(String str)
    {
        if (str == null || str.isEmpty())
        {
            return null;
        }

        int count = 1;
        char c = str.charAt(0);
        String result = "";
        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i) == c)
            {
                count++;
            }
            else
            {
                result += String.valueOf(count) + String.valueOf(c);
                count = 1;
                c = str.charAt(i);
            }
        }
        result += String.valueOf(count) + String.valueOf(c);
        return result;
    }
}

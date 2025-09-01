package in.co.nmsworks.exam2;

import com.mysql.cj.xdevapi.JsonParser;

public class JsonFileParser
{
    public static void main(String[] args)
    {
        JsonFileParser jfp = new JsonFileParser();

        String jsonString  = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";

        jfp.printParsedFile(jsonString);


    }

    private void printParsedFile(String data)
    {
        JsonParser jp = new JsonParser();
    }
}

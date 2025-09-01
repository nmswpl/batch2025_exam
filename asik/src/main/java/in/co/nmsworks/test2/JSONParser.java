package in.co.nmsworks.test2;

public class JSONParser
{
    public static void main(String[] args)
    {
        String jsonString = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\" }";
        String[] line = jsonString.replace("{", "").replace("}", "").replace("\"", "").replace(":", " is").split(", ");
        for (String str : line)
        {
            System.out.println(str.trim());
        }
    }
}

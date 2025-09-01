package in.co.nmsworks.Exam2;

public class SplitJSONUsingString
{
    private void printJSON(String json)
    {
        String[] splitString = json.split(",");
        for (String s : splitString)
        {
            s = s.replace('\"', ' ').replace('{', ' ').replace('}', ' ');
            String[] temp = s.split(":");
            System.out.println(temp[0].trim()+" is "+temp[1].trim());
        }
    }
    public static void main(String[] args)
    {
        SplitJSONUsingString splitJSONUsingString = new SplitJSONUsingString();
        String jsonInputString = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";
        splitJSONUsingString.printJSON(jsonInputString);
    }
}

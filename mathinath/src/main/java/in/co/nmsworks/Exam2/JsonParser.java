package in.co.nmsworks.Exam2;

public class JsonParser {
    public static void main(String[] args) {
        JsonParser jp = new JsonParser();
        String json = " { \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";
        jp.printParseJson(json);
    }

    private void printParseJson(String json) {
        String[] str = json.split(",:'\'",4);
        String Name;
        int Age;
        String Department;
        for (int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
//            Name = str[0];
//          Age = Integer.parseInt(str[1]);
//            Department = str[2];
        }
        System.out.println();
    }
}

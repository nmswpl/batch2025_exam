package in.co.nmsworks.Exam2;

import java.util.HashMap;
import java.util.Map;

public class JsonParser {
    public static void main(String[] args) {
        JsonParser jp = new JsonParser();
        String json = " { \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";
        jp.printParseJson(json);
    }

    private void printParseJson(String json) {
        String[] str = json.split("\\:','",3);
        for (int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
////        ,\{,\},\:
        String Name = "";
        int Age=0;
        String Department="";
        for (int i=0;i<str.length;i++)
        {
//            System.out.println(str[i]);
//            Name = str[];
//          Age = Integer.parseInt(str[]);
//            Department = str[];
        }
        System.out.println("Name  "+Name);
    }
}

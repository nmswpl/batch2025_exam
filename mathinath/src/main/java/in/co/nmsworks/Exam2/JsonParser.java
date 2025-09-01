package in.co.nmsworks.Exam2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JsonParser {
    public static void main(String[] args) {
        JsonParser jp = new JsonParser();
        String json = " { \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";
        jp.printParseJson(json);
    }

    private void printParseJson(String json) {
        String str = Arrays.toString(json.split(","));
        String words = Arrays.toString(str.split(":"));
        String words1 = Arrays.toString(words.split("\\{"));
        String words2 = Arrays.toString(words1.split(",,\\s"));
        System.out.println(words2);
        String Name = "";
        int Age=0;
        String Department="";
       for (int j=0;j<words2.length();j++)
       {
//           Name = words[j];
//          Age = Integer.parseInt(words[1]);
//            Department = words[2];
       }
////        ,\{,\},\:
        System.out.println("Name  "+Name);
        System.out.println("Age :"+Age);
        System.out.println("Department :"+Department);
    }
}

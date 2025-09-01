package in.co.nmsworks.exam2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/* . JSON Parser
Write a Java program that parses a simple JSON string and extracts its values.
Input : { "name": "John", "age": 30, "department": "cse"}
Output : Name is John
 Age is 30
 department is cse */
public class Question1 {
    public static void main(String[] args) {

        String s = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"} ";

        System.out.println(s);

       // String[] str = s.split(",");


        Map<String , String> map = new LinkedHashMap<>();
        map.put("name" , "John");
        map.put("age" ,  "30" );
        map.put("department" , "cse");

        for (Map.Entry<String, String> StringEntry : map.entrySet()) {
            System.out.println(StringEntry.getKey() + " is " + StringEntry.getValue());
        }

    }
}

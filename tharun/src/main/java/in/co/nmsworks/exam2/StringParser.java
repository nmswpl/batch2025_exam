package in.co.nmsworks.exam2;

/*
JSON Parser
Write a Java program that parses a simple JSON string and extracts its values.
Input : { "name": "John", "age": 30, "department": "cse"}
Output : Name is John
Age is 30
department is cse
 */

import java.util.Arrays;

public class StringParser {
    public static void main(String[] args) {
        StringParser stringParser = new StringParser();
        stringParser.printString();
    }

    private void printString() {
        String input = "{\"name\":\"John\" , \"age\":30, \"department\":\"cse\"}";
        String newInput=input.replace('\"',' ').replace('{',' ').replace('}',' ');
        String[] inputSplit = newInput.split(",");

        for (String value : inputSplit) {
            String [] valuesArray = value.split(":");
            System.out.println(valuesArray[0].trim() + " is " + valuesArray[1].trim());
        }
    }
}

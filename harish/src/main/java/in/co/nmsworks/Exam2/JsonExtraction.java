package in.co.nmsworks.Exam2;

import java.util.Scanner;

public class JsonExtraction {
    public static void main(String[] args) {
        String jsonString = new String();
        System.out.println("Enter the String :");
        Scanner scanner = new Scanner(System.in);
        jsonString = scanner.nextLine();
        String newJson = jsonString.replace("{","").replace("}","").trim();
        System.out.println(newJson);
        String[] splitted = newJson.split(",");
        for (String s : splitted) {
            String[] val = s.split(":");
            System.out.println(val[0].trim().replace("\"","") + " is " + val[1].trim().replace("\"",""));
        }
    }
}

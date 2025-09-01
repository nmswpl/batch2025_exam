package in.co.nmsworks.exam2;


import java.util.HashMap;

public class JsonParser {
    public static void main(String[] args) {

        String json = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";

        HashMap<String, String> map = parseJson(json);

        System.out.println("Name is " + map.get("name"));
        System.out.println("Age is " + map.get("age"));
        System.out.println("Department is " + map.get("department"));
    }

    private static HashMap<String, String> parseJson(String json) {
        HashMap<String, String> map = new HashMap<>();

        String trimmed = json.trim().substring(1, json.length() - 1).trim();


        String[] pairs = trimmed.split(",");

        for (String pair : pairs) {
            String[] keyValue = pair.split(":");

            String key = keyValue[0].trim().replaceAll("\"", "");
            String value = keyValue[1].trim().replaceAll("\"", "");
            map.put(key, value);

        }
        return map;
    }
}


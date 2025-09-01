package in.co.nmsworks.exam2;

public class JSONParser {
    public static void main(String[] args) {
       String json = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";
        json = json.trim().substring(1, json.length() - 1).trim();
        String[] pairs = json.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            String key = keyValue[0].trim().replace("\"", "");
            String value = keyValue[1].trim().replace("\"", "");
            System.out.println(key + " is " + value);
        }
    }
}

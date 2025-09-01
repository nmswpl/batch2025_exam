package in.co.nmsworks.test2;

public class JsonParser {
    public static void main(String[] args) {
        JsonParser jp = new JsonParser();
        String value = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";
        jp.printKeyAndValues(value);
    }

    private void printKeyAndValues(String str) {

        String removeBracket = str.replaceAll("[{}]", "");
        String removeQuotes = removeBracket.replaceAll("\"", "");
        String removeComma = removeQuotes.replaceAll("\\:", " is");
        String[] jsonSplit = removeComma.split(",");
        for (int i = 0; i < jsonSplit.length; i++) {
            System.out.println(jsonSplit[i]);
        }

    }
}

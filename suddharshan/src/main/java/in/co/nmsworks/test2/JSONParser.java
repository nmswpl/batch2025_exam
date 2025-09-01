package in.co.nmsworks.test2;

public class JSONParser {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        jsonParser.getJSONString("{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}");
    }
    public void getJSONString(String str){
        String newStr = str.substring(1,str.length()-1);
        String []attr = newStr.split(",");
        for (String s : attr) {
            String [] value = s.split(":");
            System.out.println(value[0].replace('"',' ').trim() +" is " + value[1].replace('"',' ').trim());
        }
    }
}

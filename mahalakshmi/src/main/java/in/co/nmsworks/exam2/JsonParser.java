package in.co.nmsworks.exam2;

public class JsonParser {
    public static void main(String[] args) {
        JsonParser json = new JsonParser();
        String str = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";
        json.printString(str);
    }

    public void printString(String str) {
        String[] splittedString = str.split(",");
        for (int i = 0; i < splittedString.length; i++) {
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            splittedString[i].replace("{","").replace("}","");
            int indexOfColon = splittedString[i].indexOf(':');
            String s1 = splittedString[i].substring(2,indexOfColon).trim();
            String s2 = splittedString[i].substring(indexOfColon+2,splittedString[i].length()-1).trim();
            char[] c1 = s1.toCharArray();
            for (char c : c1) {
                if(c != '"') {
                    sb1.append(c);
                }
            }
            char[] c2 = s2.toCharArray();
            for(char c : c2) {
                if(c != '"') {
                    sb2.append(c);
                }
            }
            System.out.println(sb1.toString() + " is " + sb2.toString());
        }
    }
}

package in.co.nmsworks.exam2;

public class JSONStringExtract
{
    public static void main(String[] args) {
     //  { "name": "John", "age": 30, "department": "cse"}
        String extract = "{ \"name\": \"John\", \"age\": 30\", \"department\": \"cse\"}";
        System.out.println(extract);
       String[] result =  extract.split("\"");
        System.out.println("Name :" +result[3]);
        System.out.println("Age" +result[6]);
        System.out.println("Department :" +result[9]);
    }
}

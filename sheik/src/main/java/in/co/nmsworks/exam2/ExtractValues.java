package in.co.nmsworks.exam2;

public class ExtractValues
{
    public static void main(String[] args) {
        String str = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";
        String[] arr = str.split(",");

        for (int i=0;i<arr.length;i++) {
                String [] sp = arr[i].split(":");
                    System.out.println(sp[0].replace("{" ,"") + " is " + sp[1].replace("}" ,"") );
        }
    }
}

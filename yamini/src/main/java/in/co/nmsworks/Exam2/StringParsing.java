package in.co.nmsworks.Exam2;

public class StringParsing {
    public static void main(String[] args) {
        String input = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";
        String[] arr = input.split("\\W+".trim());
        for(int i=1;i<arr.length-1;i++){
         System.out.println(arr[i]+" is "+arr[i+1]);
         i++;

        }

    }
}

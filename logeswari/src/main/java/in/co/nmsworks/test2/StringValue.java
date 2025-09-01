package in.co.nmsworks.test2;

public class StringValue {

    public void etractString(){

        String value = "{ \"name\",\"John\",\"age\",\" 30\", \"department\", \"cse\"}";
        String name= value.replaceAll("\\s", "");


        System.out.println(name);
           for(int i=1;i<=name.length();i++){
               System.out.println("Name is "+name);
           }

//        System.out.println("Name is "+);
//       System.out.println("Age is "+value[3]);
//       System.out.println("Department is "+value[5]);

    }

    public static void main(String[] args) {
        StringValue stringValue=new StringValue();
        stringValue.etractString();
    }
}

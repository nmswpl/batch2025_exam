package in.co.nmsworks.javaexam2;

import com.google.gson.Gson;

public class Parser {
    public static void main(String[] args) {


        Parser parser = new Parser();

        String jsonString = "{ name: John, age: 30, department: cse}";

        parser.extractsValues(jsonString);

    }

    private void extractsValues(String jsonString) {

        Gson gson = new Gson();
        Details details = gson.fromJson(jsonString,Details.class);

        String name = details.getName();
        int age = details.getAge();
        String department = details.getDepartment();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("department is " + department);

    }
}

class Details {
    String name;
    int age;
    String department;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}
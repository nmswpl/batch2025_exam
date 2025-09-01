package in.co.nmsworks.test2;

import in.co.nmsworks.SalesInformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Information {

    String name;
    int age;
    String gender;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String setGender(String gender) {
        this.gender = gender;
        return gender;
    }

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public List<Information> showDataTwoRows(List<Information> Information) {
//        String sql="INSERT INTO Details Values(?,?,?,?,?,?)";
        String sql = "SELECT name,age,gender FROM Details; ";
        List<Information> list = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/titanic.csv"))) {
            try (PreparedStatement preparedStatement = con.prepareStatement(sql);
                 ResultSet rs = preparedStatement.getResultSet()) {
//                Map<String,Integer> avg=new HashMap<>();
                String line = "";
                while ((br.readLine()) != null) {
                    String[] word = line.split(",");
                    line.trim();

                    String name = setName(rs.getNString(1));
                    int price = setAge(rs.getInt(3));
                    String category = setGender(rs.getNString(2));
                    System.out.println(list.toString());


                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (List<Information>) showDataTwoRows(list);


    }

}

package in.co.nmsworks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDeatilsGet {
    public static void main(String[] args) {
        LoginCredential loginCredential=new LoginCredential();
        loginCredential.isUserNameValidOrNot("Brit Meacher","lL5{&~og,yKtb|U");
        System.out.println("user Name : "+loginCredential.getUserName());

    }
    public List<SalesInformation> readDate(){
//        String sql="INSERT INTO user_details Values(?,?,?,?,?,?)";
        String sql="Select * from user_details";
        List<Integer> list=new ArrayList<>();

        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            BufferedReader br= new BufferedReader(new FileReader("/home/nms-training/git/batch2025_exam/logeswari/src/main/resources/user_details.sql")))
        {
            try(PreparedStatement preparedStatement= con.prepareStatement(sql);
                ResultSet rs= preparedStatement.getResultSet()) {

                String line = "";
                while (br.readLine()!=null){
                    String[] word=line.split(",");
                    int id=rs.getInt(1);
                    String name=rs.getString(2);
                    String gender=rs.getString(3);
                    String userName=rs.getString(4);
                    String password=rs.getString(5);
                    boolean acStatus=rs.getBoolean(6);
                    preparedStatement.executeQuery();
                    list.add(readDate().size());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return readDate();
    }


}

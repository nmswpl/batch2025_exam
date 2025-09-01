package in.co.nmsworks.exam;

import java.sql.*;
import java.util.*;

class LoginCredentials {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username : ");
        String name = sc.nextLine();
        System.out.println("Enter the password: ");
        String password = sc.nextLine();

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training" , "nms-training" ,"nms-training");
            Statement stmt= con.createStatement();
            ResultSet rs = stmt.executeQuery("select username , password from  user_details ")){

            while(rs.next()){
                if(rs.getString(1).equalsIgnoreCase(name)){

                }
                rs.getString(2);

            }

        }
         catch (SQLException e) {
            throw new RuntimeException(e);
        } ;





    }
}

package in.co.nmsworks.JavaTraining;

import java.sql.*;
import java.util.Scanner;

public class LoginCredential {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String name = sc.nextLine();
        System.out.println("Enter password :");
        String password = sc.next();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
        PreparedStatement ps = con.prepareStatement("select * from user_details where username=name and username = password");
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {

        }
    }
}

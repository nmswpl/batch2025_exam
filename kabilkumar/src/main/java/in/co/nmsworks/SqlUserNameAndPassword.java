package in.co.nmsworks;

import java.sql.*;
import java.util.Scanner;

public class SqlUserNameAndPassword {
    public static void main(String[] args) {
        System.out.println("Enter your user Name: ");
        System.out.println("Enter your Password :");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        String password = scanner.next();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("select * from  user_details where username = ? and password = ?")) {
            ps.setString(1, userName);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery())
            {
                while (rs.next())
                {

                }

            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

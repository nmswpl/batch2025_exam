package in.co.nmsworks.test;

import java.sql.*;
import java.util.Scanner;

public class LoginCredential
{
    public static void main(String[] args)
    {
        LoginCredential loginCredential = new LoginCredential();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName : ");
        String username = sc.nextLine();
        System.out.println("Enter Password :");
        String password = sc.nextLine();

        boolean isValid = loginCredential.checkUserNameAndPassword(username, password);

        System.out.println(isValid ? "Valid Credentials" : "Invalid Credentials");
    }

    private boolean checkUserNameAndPassword(String username, String password)
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement pstmt = con.prepareStatement("select * from user_details where username = ? and password = ?"))
        {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next())
            {
                return true;
            }

        }
        catch (SQLException se)
        {
            se.printStackTrace();
        }
        return false;
    }
}

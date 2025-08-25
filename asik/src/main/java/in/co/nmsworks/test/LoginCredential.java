package in.co.nmsworks.test;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginCredential
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName : ");
        String userName = sc.nextLine();
        System.out.println("Enter Password :");
        String password = sc.nextLine();

        boolean isValid = checkUserNameAndPassword(userName, password);

        System.out.println(isValid ? "Valid Credentials" : "Invalid Credentials");
    }

    private static boolean checkUserNameAndPassword(String userName, String password)
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement pstmt = con.prepareStatement("select * from user_details where username = ? and password = ?"))
        {
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            Resultset rs = (Resultset) pstmt.executeQuery();
            while (rs.getRows().hasNext())
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

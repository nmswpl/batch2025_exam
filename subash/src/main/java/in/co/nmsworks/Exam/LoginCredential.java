package in.co.nmsworks.Exam;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginCredential
{
   private String url = "jdbc:mysql://localhost:3306/training";
    private String pass = "nms-training";
   private String host = "nms-training";

    public static void main(String[] args) {

        LoginCredential lc = new LoginCredential();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the UserName");
        String name = sc.nextLine();
        System.out.println("Enter the Password");
        String password = sc.nextLine();
        boolean found = lc.findInvalidOrInvalidDetails(name,password);
        if(found)
            System.out.println("Valid User Name and Password");
        else
            System.out.println("INvalid username or password");
    }

    private boolean findInvalidOrInvalidDetails(String name, String password)
    {

        ResultSet rs = null;
        Map<String,Double> mapAvg = new HashMap<>();
        boolean found = false;
        String query = "Select * from user_details where username = ? and password = ?";
        try (Connection con = DriverManager.getConnection(url, host, pass);
             PreparedStatement ps = con.prepareStatement(query))
        {
            ps.setString(1,name);
            ps.setString(2,password);
            rs=ps.executeQuery();

            while (rs.next())
            {
               found=true;
            }
            if(found) {

                return found;
            }
            else
            {

                return found;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

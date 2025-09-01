package in.co.nmsworks.exam;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginCredentials {
    public static void main(String[] args) {
        LoginCredentials login = new LoginCredentials();
        Map<String,String> credentials = login.storeUserCredentails();
        login.validateCredentials(credentials);

    }

    private void validateCredentials(Map<String, String> credentials) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String name = input.next();
        input.nextLine();
        if (credentials.containsKey(name)){
            System.out.println("Enter password : ");
            String password = input.next();
            if (credentials.get(name).equals(password)){
                System.out.println("Password valid");
            }
            else {
                System.out.println("Password Invalid");
            }
        }
        else {
            System.out.println(" Username Invalid ");
        }
    }

    private Map<String,String> storeUserCredentails() {
        Map<String,String> credentials = new HashMap<>();
        ResultSet rs = null;
        String query = "SELECT username , password FROM user_details";
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement(query))
        {
            rs = ps.executeQuery();
            while (rs.next()){
                credentials.put(rs.getString(1),rs.getString(2));
            }
            rs.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return credentials;
    }
}

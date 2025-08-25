package in.co.nmsworks.javaexam;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserPassValidate {
    public static void main(String[] args) {
        UserPassValidate userPassValidate = new UserPassValidate();

        userPassValidate.validateTheCredential();

        List<UserDetails> userDetails = new ArrayList<>();
        Set<String> setOfActiveFemale = userPassValidate.getActiveFemaleName(userDetails);

    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetails) {
            return null;
    }

    private void validateTheCredential() {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "nms-training";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : " + " ");
        String userName = sc.next();
        System.out.println("Enter password : " + " ");
        String passwordPass = sc.next();

        String sql = "select username, password from user_details";


        try (Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql) )
            {
                while (resultSet.next()) {
                    String userNamein = resultSet.getString("username");
                    String passwordin = resultSet.getString("password");

                    if (userNamein.contains(userName) && passwordin.contains(passwordPass)) {
                        System.out.println("Password is Valid");
                    }
                    else if (!(userNamein.contains(userName))) {
                        System.out.println("Invalid Username");
                    }
                    else if(!(passwordin.contains(passwordPass))) {
                        System.out.println("Invalid Password");
                    }
                }

            } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

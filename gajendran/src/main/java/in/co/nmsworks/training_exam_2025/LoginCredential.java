package in.co.nmsworks.training_exam_2025;

import java.sql.*;
import java.util.Scanner;

public class LoginCredential
{

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        LoginCredential loginCredential = new LoginCredential();

        loginCredential.login();
    }

    private void login()
    {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement preparedStatement = connection.prepareStatement("select username from user_details where username = ?  and password = ?;");

            System.out.print("Enter user name : ");
            String userName = scanner.next().trim();
            System.out.print("Enter ur password : ");
            String passKey = scanner.next().trim();
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,passKey);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            if (resultSet.getString(1).equals(userName))
            {
                System.out.println("Password is Valid");
            }
            else
            {
                System.out.println("Password is Not Valid");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

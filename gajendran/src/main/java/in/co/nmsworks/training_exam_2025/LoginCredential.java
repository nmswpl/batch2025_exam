package in.co.nmsworks.training_exam_2025;

import java.sql.*;
import java.util.*;

public class LoginCredential
{

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        LoginCredential loginCredential = new LoginCredential();

        loginCredential.login();

        List<UserDetails> userDetailsList = loginCredential.getActiveFemaleNameInList();
        Set<String> activeFemaleName = loginCredential.getActiveFemaleName(userDetailsList);




    }

    private List<UserDetails> getActiveFemaleNameInList()
    {
        List<UserDetails> userDetailsList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user_details where gender = ?  and account_status = ?;");

            preparedStatement.setString(1,"Female");
            preparedStatement.setString(2,"Active");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                userDetailsList.add(new UserDetails(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6)));
            }
            return userDetailsList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList)
    {
        Set<String> activeFemaleName = new HashSet<>();
        for (UserDetails userDetails : userDetailsList)
        {
            activeFemaleName.add(userDetails.getName());
        }
        for (String s : activeFemaleName)
        {
            System.out.println("Name of Active Femail user : "+s);
        }
        return activeFemaleName;

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

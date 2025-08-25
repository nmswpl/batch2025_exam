package in.co.nmsworks.test;

import java.sql.*;
import java.util.Scanner;

public class FourthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username");
        String userName = scanner.nextLine();
        System.out.println("Enter Password");
        String passWord = scanner.nextLine();
        FourthQuestion fr = new FourthQuestion();
        fr.checkUsernamevalid(userName,passWord,"/home/nms-training/git/batch2025_exam/harish/src/main/resources/user_details.sql");
    }

    private void checkUsernamevalid(String userName, String passWord, String fileName) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            try (PreparedStatement ps = connection.prepareStatement("Select * from user_details")) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    if(rs.getString(4).equals(userName) && rs.getString(5).equals(passWord)){
                            System.out.println("Username And PassWord is valid");
                    }
                    else if (rs.getString(4).equals(userName)){
                        System.out.println("Username is Valid");
                    } else if (rs.getString(5).equals(passWord)) {
                        System.out.println("Password is valid");
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

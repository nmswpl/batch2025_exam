package in.co.nmsworks.retest;

import java.sql.*;
import java.util.*;
import java.io.Console;

public class UserAuthApp {

    static class UserDetails {
        String username;
        String password;

        public UserDetails(String username, String password) {
            this.username = username;
            this.password = password;
        }

        @Override
        public String toString() {
            return "UserDetails{" +
                    "username='" + username +
                    ", password='" + password  +
                    '}';
        }
    }

    private static final String DB_URL = "jdbc:mysql://localhost:3306/training";
    private static final String DB_USER = "nms-training";
    private static final String DB_PASS = "nms-training";

    public static void main(String[] args) {

        List<UserDetails> userList = new ArrayList<>();
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            System.exit(1);
        }

        String username = console.readLine("Enter username: ");
        char[] passwordChars = console.readPassword("Enter password: ");
        String password = new String(passwordChars);

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

            String query = "SELECT password FROM user_details WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (!rs.next()) {
                System.out.println("Invalid Username");
            } else {
                String dbPassword = rs.getString("password");
                if (dbPassword.equals(password)) {
                    System.out.println("Password is Valid");


                    UserDetails user = new UserDetails(username, password);
                    userList.add(user);


                } else {
                    System.out.println("Invalid Password");
                }
            }

            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println("Users in list:");
        for (UserDetails u : userList) {
            System.out.println(u);
        }
    }


    public static void updatePassword(Connection conn, String username, String newPassword) {
        String updateQuery = "UPDATE user_details SET password = ? WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
            pstmt.setString(1, newPassword);
            pstmt.setString(2, username);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Password updated successfully for user: " + username);
            } else {
                System.out.println("password not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

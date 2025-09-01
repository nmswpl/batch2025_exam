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


//import java.sql.*;
//        import java.util.*;
//
//class UserDetails {
//    String username;
//    String password;
//    String gender;
//    String status;
//
//    public UserDetails(String username, String password, String gender, String status) {
//        this.username = username;
//        this.password = password;
//        this.gender = gender;
//        this.status = status;
//    }
//}
//
//public class UserPassValidate {
//    public static void main(String[] args) {
//        validateTheCredential();
//
//        List<UserDetails> users = Arrays.asList(
//                new UserDetails("john24", "93a5fe6...", "Female", "Active"),
//                new UserDetails("mike11", "xyz123", "Male", "Inactive"),
//                new UserDetails("sara22", "abc111", "Female", "Active")
//        );
//
//        System.out.println(getActiveFemaleName(users));
//    }
//
//    private static void validateTheCredential() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter username: ");
//        String inputUser = sc.next();
//        System.out.print("Enter password: ");
//        String inputPass = sc.next();
//
//        String url = "jdbc:mysql://localhost:3306/training";
//        String dbUser = "nms-training";
//        String dbPass = "nms-training";
//
//        String sql = "SELECT username, password FROM user_details";
//
//        try (Connection con = DriverManager.getConnection(url, dbUser, dbPass);
//             Statement st = con.createStatement();
//             ResultSet rs = st.executeQuery(sql)) {
//
//            boolean foundUser = false, correctPass = false;
//
//            while (rs.next()) {
//                if (rs.getString("username").equals(inputUser)) {
//                    foundUser = true;
//                    if (rs.getString("password").equals(inputPass)) {
//                        correctPass = true;
//                    }
//                    break;
//                }
//            }
//
//            if (!foundUser) System.out.println("Invalid Username");
//            else if (!correctPass) System.out.println("Invalid Password");
//            else System.out.println("Password is Valid");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static Set<String> getActiveFemaleName(List<UserDetails> users) {
//        Set<String> activeFemales = new HashSet<>();
//        for (UserDetails u : users) {
//            if (u.gender.equalsIgnoreCase("Female") && u.status.equalsIgnoreCase("Active")) {
//                activeFemales.add(u.username);
//            }
//        }
//        return activeFemales;
//    }
//}

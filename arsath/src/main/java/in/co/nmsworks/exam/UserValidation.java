package in.co.nmsworks.exam;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserValidation {
    public static void main(String[] args) {
        UserValidation userValidation = new UserValidation();
        userValidation.validateUser();
    }

    public void validateUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String user = sc.next();
        System.out.println("Enter your password: ");
        String pass = sc.next();
        String sql = "SELECT * FROM user_details";
        Map<String, String> validationMap = new HashMap<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String emp_id = rs.getString(1);
                String name = rs.getString(2);
                String gender = rs.getString(3);
                String userName = rs.getString(4);
                String password = rs.getString(5);
                String accountStatus = rs.getString(6);
                validationMap.put(userName, password);

            }
//            System.out.println(validationMap);

//            for (Map.Entry<String, String> entry : validationMap.entrySet()) {
//                if(entry.getKey().contains(user) && entry.getValue().contains(pass)){
//                    System.out.println("User Validation is successful!");
//                }
//                else{
//                    System.out.println("User Validation is not successful and the access is denied!");
//                }
//            }

            if(validationMap.containsKey(user) && validationMap.get(user).equals(pass)){
                System.out.println("Success");
            }
            else if(!validationMap.containsKey(user)){
                System.out.println("Invalid user");
            }
            else if (!validationMap.get(user).equals(pass)){
                System.out.println("Invalid password");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

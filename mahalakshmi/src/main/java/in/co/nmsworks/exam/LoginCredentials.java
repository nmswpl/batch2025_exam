package in.co.nmsworks.exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoginCredentials {
    public static void main(String[] args) throws SQLException {
        LoginCredentials lc = new LoginCredentials();
        List<UserDetails> userDetails = lc.getAllDataFromDb();
        System.out.println(userDetails);
        String name = "john24";
        String password = "93a5fe6210bfcdb573ccd348e19e6a56";
        System.out.println(lc.checkUserNameAndPassword(userDetails,name,password));
        System.out.println("Female name List with Active Account Status: " +lc.getActiveFemaleName(userDetails));
    }

    public List<UserDetails> getAllDataFromDb() throws SQLException {
        List<UserDetails> userDetailsList = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement ps = con.prepareStatement("select * from user_details");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                userDetailsList.add(new UserDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        }
        return userDetailsList;
    }

    public String checkUserNameAndPassword(List<UserDetails> userDetails,String userName, String password) {
        for (UserDetails detail : userDetails) {
            if(detail.getUserName().equals(userName)) {
                if (detail.getPassword().equals(password)) {
                    return "Password is valid";
                }
                else {
                    return "Invalid Password";
                }
            }
        }
        return "Invalid UserName!";
    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetails)  {
        Set<String> femaleList = new HashSet<>();
        for (UserDetails detail : userDetails) {
            if(detail.getAccountStatus().equals("Active") && detail.getGender().equals("Female")) {
                femaleList.add(detail.getName());
            }
        }
        return femaleList;
    }
}

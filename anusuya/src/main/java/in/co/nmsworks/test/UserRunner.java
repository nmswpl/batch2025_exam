package in.co.nmsworks.test;

import java.sql.*;
import java.util.*;

public class UserRunner {

    public static void main(String[] args) {

        UserRunner user = new UserRunner();

        UserDetails ud = new UserDetails();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USERNAME : ");
        String username = sc.nextLine();
        System.out.print("Enter PASSWORD : ");
        String password = sc.nextLine();
        user.checkUsernameAndPasswordAndPrintAppropriateMessage(username,password);

        List<UserDetails> userDetailsList = user.createObjectsForUserDetails();

        Set<String> activeFemaleSet = user.getActiveFemaleName(userDetailsList);
        System.out.println("ACTIVE Female Users : \n" + activeFemaleSet);
    }

    public void checkUsernameAndPasswordAndPrintAppropriateMessage(String username, String password) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT username,password FROM user_details")) {

            Map<String,String> usernamePassword = new HashMap<>();
            while (rs.next()) {
                usernamePassword.put(rs.getString(1), rs.getString(2));
            }

            if(usernamePassword.containsKey(username)){
                if(usernamePassword.get(username).equals(password)){
                    System.out.println("USERNAME AND PASSWORD IS VALID");
                }
                else{
                    System.out.println("INVALID PASSWORD");
                }
            }
            else{
                System.out.println("INVALID USERNAME");
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<UserDetails> createObjectsForUserDetails() {

        List<UserDetails> tempUserDetailsList = new ArrayList<>();

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            Statement st = con.createStatement()){

            try(ResultSet rs = st.executeQuery("SELECT * FROM user_details")){
                while((rs.next())){
                    tempUserDetailsList.add(new UserDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getNString(5), rs.getNString(6)));
                }
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tempUserDetailsList;
    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList) {

        Set<String> tempActiveFemaleNameSet = new HashSet<>();

        for (UserDetails user : userDetailsList) {
            if (user.getAccount_status().equals("Active") && user.getGender().equals("Female")){
                tempActiveFemaleNameSet.add(user.getName());
            }
        }
        return tempActiveFemaleNameSet;
    }
}

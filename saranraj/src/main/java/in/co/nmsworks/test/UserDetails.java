package in.co.nmsworks.test;

import java.sql.*;
import java.util.*;

public class UserDetails {
    private String emp_id;
    private String name;
    private String gender;
    private String username;
    private String password;
    private String account_status;

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount_status() {
        return account_status;
    }

    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }

    public UserDetails(String emp_id, String name, String gender, String username, String password, String account_status) {
        this.emp_id = emp_id;
        this.name = name;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.account_status = account_status;
    }

    public UserDetails() {
    }

    public static void main(String[] args) {
        UserDetails ud = new UserDetails();
        List<UserDetails> listOfUserDetails = ud.getDataFromFile();
        ud.checkUserValidateOrNot(listOfUserDetails);
        Set<String> femaleNameList = ud.getActiveFemaleName(listOfUserDetails);
        System.out.println("The List Of Female Names");
        System.out.println(femaleNameList);

    }

    private void checkUserValidateOrNot(List<UserDetails> listOfUserDetails) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = s.nextLine();
        System.out.println("Enter the Password");
        String pasword = s.nextLine();
        for (UserDetails u :listOfUserDetails) {
            if (username.equalsIgnoreCase(u.getUsername()) && password.equalsIgnoreCase(u.getPassword())){
                 if ()
            }
        }

    }

    private Set<String> getActiveFemaleName(List<UserDetails> listOfUserDetails) {
        Set<String> setOfUserDetails = new HashSet<>();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = conn.prepareStatement("select name from user_details where account_status='Active' and gender ='Female'")

        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String name = rs.getString("name");

                setOfUserDetails.add(name);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return setOfUserDetails;
    }


    public List<UserDetails> getDataFromFile() {
        List<UserDetails> listOfUserDetails = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = conn.prepareStatement("select * from user_details")

        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String emp_id = rs.getString("emp_id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String account = rs.getString("account_status");
                UserDetails ud = new UserDetails(emp_id, name, gender, username, password, account_status);
                listOfUserDetails.add(ud);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listOfUserDetails;
    }

}


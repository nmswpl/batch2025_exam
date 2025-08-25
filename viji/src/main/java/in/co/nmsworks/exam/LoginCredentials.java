package in.co.nmsworks.exam;

import java.sql.*;
import java.util.*;

class LoginCredentials {

    public static void main(String[] args) {

       List<UserDetails> list =  getUserDetails();
       Set<String> femaleName=  getActiveFemaleName(list);
       System.out.println(femaleName);

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement();
             ResultSet res = stmt.executeQuery(" select username , password from user_details ")) {

            while (res.next()) {
                String userName = res.getString("username");
                String password = res.getString("password");
                System.out.println("UserName : " + userName + "Password : " + password);
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter userName");
                String name = sc.nextLine();
                System.out.println("Enter Password");
                String passWord1 = sc.nextLine();
                if (name.equals("john24")) {
                    System.out.println("Name is valid");
                } else if (passWord1.equals("93a5fe6210bfcdb573ccd348e19e6a56")) {
                    System.out.println("Password is valid ");
                } else {
                    System.out.println("Input is valid");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static List<UserDetails> getUserDetails() {
        List<UserDetails> detailsList = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement();
             ResultSet res = stmt.executeQuery(" select username , password from user_details ")) {

            while (res.next()) {
                int id = res.getInt("emp_id");
                String name = res.getString("name");
                String gender = res.getString("gender");
                String userName = res.getString("username");
                String password = res.getString("password");
                String accountStatus = res.getString("account_status");

                UserDetails ud = new UserDetails(id, name, gender, userName, password, accountStatus);
                detailsList.add(ud);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return detailsList;
    }


    private static Set<String> getActiveFemaleName(List<UserDetails> list) {
         Set<String> answer = new LinkedHashSet<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement();
             ResultSet res = stmt.executeQuery(" select name from user_details where gender = 'female' && active_status = 'Active' " )){

            for(UserDetails u : list){
                while(res.next()){
                    String name = res.getString("name");
                   answer.add(name);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }


}





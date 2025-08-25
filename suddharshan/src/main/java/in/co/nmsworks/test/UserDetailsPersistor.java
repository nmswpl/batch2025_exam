package in.co.nmsworks.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class UserDetailsPersistor {
    public static void main(String[] args) {
        UserDetailsPersistor udp = new UserDetailsPersistor();

        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter username: ");
        String username = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();*/

        String username = "john24";
        String password = "93a5fe6210bfcdb573ccd348e19e6a56";

        udp.checkUserNameAndPassword(username,password);

        List<UserDetails> users = udp.createUserList();

        System.out.println(udp.getActiveFemaleName(users));
    }
    public void checkUserNameAndPassword(String userName, String password){
        int userFlag = 0, passFlag = 0;
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","user-training","user-training");
            PreparedStatement ps = con.prepareStatement("select username, password from user_details") ){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getString(1).equals(userName)){
                    userFlag = 1;
                }
                if(rs.getString(2).equals(password)){
                    passFlag = 1;
                }
            }
            if(userFlag == 1 && passFlag == 1){
                System.out.println("Password is Valid");
            }
            if(userFlag == 0 && passFlag == 1){
                System.out.println("Invalid Username");
            }
            if(userFlag == 1 && passFlag == 0){
                System.out.println("Invalid Password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<UserDetails> createUserList(){
        List<UserDetails> userDetailsList = new ArrayList<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","user-training","user-training");
            PreparedStatement ps = con.prepareStatement("select * from user_details") ){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                UserDetails user = new UserDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                userDetailsList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  userDetailsList;
    }
    public Set<String> getActiveFemaleName(List <UserDetails> users){
        Set <String> femaleNames = new HashSet<>();
        for (UserDetails user : users) {
            if(user.getGender().equalsIgnoreCase("female")){
                femaleNames.add(user.getName());
            }
        }
        return femaleNames;
    }
}

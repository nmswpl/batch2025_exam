package in.co.nmsworks.Test;

import java.sql.*;
import java.util.*;

public class Login {
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter username: ");
        String username = scan.nextLine();
        //System.out.println("Enter password: ");
        String password = scan.nextLine();
        Login log=new Login();
        //log.validate(username,password);
        log.getActiveFemaleNAme(users);


    }

    public void validate(String username,String password) throws SQLException {
        Map<String,String> map= new HashMap<>();
        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps=con.prepareStatement("Select username,password from user_details");) {
            ResultSet rs;

            rs = ps.executeQuery();
            while (rs.next()) {
                map.put(rs.getString(1), rs.getString(2));
                //System.out.println("username: "+rs.getString(1)+" password: "+rs.getString(2));
            }
            for (Map.Entry<String, String> user : map.entrySet()) {
                if (Objects.equals(map.get(username), password)) {
                    System.out.println("Password is Valid");
                }
                else{
                    System.out.println("Invalid");
                    break;
                }
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
     static  List<UserDetails> users = new ArrayList<>();
    public Set<String> getActiveFemaleNAme(List<UserDetails> users) throws SQLException {
        Set<String>activeFemales=new HashSet<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("Select * from user_details");) {
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Login.users.add(new UserDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));

            }
            for (UserDetails userDetails : Login.users) {
                if(userDetails.getAccountStatus().equalsIgnoreCase("Active") && userDetails.getGender().equalsIgnoreCase("female")){
                    activeFemales.add(userDetails.getName());
                }
            }

        }
        return activeFemales;
    }
}
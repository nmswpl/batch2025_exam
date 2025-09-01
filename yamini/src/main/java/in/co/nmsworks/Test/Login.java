package in.co.nmsworks.Test;

import java.sql.*;
import java.util.*;

public class Login {
    public static void main(String[] args) throws SQLException {

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter username: ");
        //String username = scan.nextLine();
        //System.out.println("Enter password: ");
        //String password = scan.nextLine();
       Login log=new Login();
        // log.validate(username,password);
        System.out.println(log.getActiveFemaleName());


    }

    public void validate(String username,String password) throws SQLException {
        Map<String,String> map= new HashMap<>();
        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps=con.prepareStatement("Select username,password from user_details");) {
            ResultSet rs;

            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("1");
                map.put(rs.getString(1), rs.getString(2));
                //System.out.println("username: "+rs.getString(1)+" password: "+rs.getString(2));
            }
            for (Map.Entry<String, String> user : map.entrySet()) {
                System.out.println(2);
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
      
    public Set<String> getActiveFemaleName() throws SQLException {

        //System.out.println(4);
        Set<String>activeFemales=new HashSet<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("Select username from user_details where gender='Female' and account_status='Active'");) {
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                //System.out.println(3);
                activeFemales.add(rs.getString(1));
            }

            }
        return activeFemales;
    }
}
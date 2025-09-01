package in.co.nmsworks.Exam;

import java.sql.*;
import java.util.*;

public class LoginCredential
{
   private String url = "jdbc:mysql://localhost:3306/training";
    private String pass = "nms-training";
   private String host = "nms-training";

    public static void main(String[] args) {

        LoginCredential lc = new LoginCredential();
        Scanner sc = new Scanner(System.in);
//        List<UserDetails> userDetailsList =lc.readDbToClass();
//        lc.getActiveFemaleName(userDetailsList);
//        Set<String> femaleSet = lc.getActiveFemaleName(userDetailsList);
//        System.out.println(femaleSet);
        System.out.println("Enter the UserName");
        String name = sc.nextLine();
        System.out.println("Enter the Password");
        String password = sc.nextLine();
        boolean found = lc.findInvalidOrInvalidDetails(name,password);
        if(found)
            System.out.println("Valid");
        else
            System.out.println("INvalid");
    }

    private boolean findInvalidOrInvalidDetails(String name, String password)
    {

        ResultSet rs = null;
        Map<String,String> mapVerifier = new HashMap<>();
        boolean found = false;
        String query = "Select username,password from user_details";
        try (Connection con = DriverManager.getConnection(url, host, pass);
             PreparedStatement ps = con.prepareStatement(query))
        {
            rs=ps.executeQuery();

            while (rs.next())
            {
               String username = rs.getString(1);
               String passwordMap = rs.getString(2);
               mapVerifier.put(username,passwordMap);
            }
            rs.close();
            if(mapVerifier.containsKey(name))
            {
               String passCheck =  mapVerifier.get(name);
               if(passCheck.equals(password))
               {
                   System.out.println("User and Password are Valid\nUser Found");
                   return true;
               }
               else
               {
                   System.out.println("Invalid Password");
                   return false;
               }
            }

            else
            {
                System.out.println("Invalid Username");
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList)
    {
        Set<String> femaleSet = new LinkedHashSet<>();

        for (UserDetails userDetails : userDetailsList) {

            if(userDetails.getGender().equals("Female"))
            {
                if(userDetails.getAccount_status().equals("Active"))
                {
                    femaleSet.add(userDetails.getUsername());
                }
            }

        }

        return femaleSet;
    }

    private List<UserDetails>  readDbToClass()
    {
        List<UserDetails> userList = new ArrayList<>();

        ResultSet rs = null;
        String query = "Select * from user_details";
        try (Connection con = DriverManager.getConnection(url, host, pass);
             PreparedStatement ps = con.prepareStatement(query))
        {
            rs=ps.executeQuery();

            while (rs.next())
            {
                userList.add(new UserDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }

            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

}

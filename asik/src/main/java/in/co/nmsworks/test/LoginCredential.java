package in.co.nmsworks.test;

import java.sql.*;
import java.util.*;

public class LoginCredential
{
    public static void main(String[] args)
    {
        List<UserDetails> userDetailsList = new ArrayList<>();

        LoginCredential loginCredential = new LoginCredential();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName : ");
        String username = sc.nextLine();
        System.out.println("Enter Password :");
        String password = sc.nextLine();

        loginCredential.printIfValidUserNameAndPassword(username, password);

        userDetailsList = loginCredential.getAllUsersInList();

        Set<String> activeFemaleUsers = loginCredential.getActiveFemaleName(userDetailsList);

        for (String activeFemaleUser : activeFemaleUsers)
        {
            System.out.println(activeFemaleUser);
        }
    }

    private List<UserDetails> getAllUsersInList()
    {
        List<UserDetails> userDetailsList = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement())
        {
            ResultSet rs = stmt.executeQuery("select * from user_details");
            while (rs.next())
            {
                int id = Integer.parseInt(rs.getString(1).replace("-", "").trim());
                String name = rs.getString(2).trim();
                String gender = rs.getString(3).trim();
                String usrname = rs.getString(4).trim();
                String passwrd = rs.getString(5).trim();
                String status = rs.getString(6).trim();
                UserDetails userDetail = new UserDetails(id, name, gender, usrname, passwrd, status);
                userDetailsList.add(userDetail);
            }
        }
        catch (SQLException se)
        {
            se.printStackTrace();
        }
        return userDetailsList;
    }

    private Set<String> getActiveFemaleName(List<UserDetails> userDetailsList)
    {
       Set<String> activeFemaleUsers = new HashSet<>();

       for (UserDetails userDetail : userDetailsList)
       {
           if (userDetail.getGender().equalsIgnoreCase("female") && userDetail.getStatus().equalsIgnoreCase("active"))
           {
               activeFemaleUsers.add(userDetail.getName());
           }
       }
       return activeFemaleUsers;
    }

    private void printIfValidUserNameAndPassword(String username, String password)
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement pstmt = con.prepareStatement("select username, password from user_details where username = ? or password = ?"))
        {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            boolean isFound = false;
            while (rs.next())
            {
                isFound = true;
                if (rs.getString(1).equals(username))
                {
                    System.out.println(rs.getString(2).equals(password) ? "Valid Username, Valid Password" : "Valid Username, Invalid Password");
                }
                else
                {
                    System.out.println("Invalid Username, Valid Password");
                }
            }
            if (!isFound)
            {
                System.out.println("Invalid Username, Invalid Password");
            }

        }
        catch (SQLException se)
        {
            se.printStackTrace();
        }
    }
}

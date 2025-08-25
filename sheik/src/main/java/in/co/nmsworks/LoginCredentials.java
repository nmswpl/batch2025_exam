
package in.co.nmsworks;

import java.sql.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoginCredentials
{
    public static void main(String[] args) {
        List<UserDetails> userset = new HashSet<>();
        try(Connection con = DriverManager.getConnection("/home/nms-training/git/batch2025_exam/sheik/src/main/resources/user_details.sql","nms-training" , "nms-training")) {
            PreparedStatement ps = con.prepareStatement("select * from user_details");

            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                userset.add(new UserDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(5)));
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


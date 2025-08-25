package in.co.nmsworks;

import java.sql.*;

public class SqlUserNameAndPassword {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("select * from  user_details where username ? and password = ?"))

        {
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                ps.setString(1,"john24");
                ps.setString(2,"93a5fe6210bfcdb573ccd348e19e6a56");
                ps.executeUpdate();

            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

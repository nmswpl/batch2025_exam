package in.co.nmsworks.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourthQuestionOptionB {
    public static void main(String[] args) {
        List<UserDetails> users = addListObjectFromDb("/home/nms-training/git/batch2025_exam/harish/src/main/resources/user_details.sql");
        Set<String> femaleName = getActiveFemaleName(users);
        System.out.println(femaleName);

    }

    private static Set<String> getActiveFemaleName(List<UserDetails> users) {
        Set<String> femaleName = new HashSet<>();
        for (UserDetails user : users) {
            if(user.getGender().equals("Female")){
                femaleName.add(user.getName());
            }
        }
        return femaleName;
    }

    private static List<UserDetails> addListObjectFromDb(String fileName) {
        List<UserDetails> users = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            try (PreparedStatement ps = connection.prepareStatement("Select * from user_details")) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    UserDetails user = new UserDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                    users.add(user);
                }
            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }
}

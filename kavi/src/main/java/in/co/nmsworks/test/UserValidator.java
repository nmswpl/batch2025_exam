package in.co.nmsworks.test;


import java.sql.*;
import java.util.*;

public class UserValidator {

    private static Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "john24";
        String password = "93a5fe6210bfcdb573ccd348e19e6a56";
        return DriverManager.getConnection(url, user, password);
    }

    private static boolean validateCredentials(String username, String passwordInput) {
        try (Connection conn = connect()) {
            String query = "SELECT password FROM user_details WHERE username = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (!rs.next()) {
                System.out.println("Invalid Username");
                return false;
            } else {
                String storedPassword = rs.getString("password");
                if (storedPassword.equals(passwordInput)) {
                    System.out.println("password is validate");
                    return true;
                } else {
                    System.out.println("Invalid password");
                    return false;
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error" + e.getMessage());
            return false;
        }
    }


    private static List<UserDetails> getAllUsers() {
        List<UserDetails> users = new ArrayList<>();
        try (Connection conn = connect()) {
            String query = "SELECT * FROM user_details";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                UserDetails user = new UserDetails(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("gender"),
                        rs.getBoolean("is_active")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching users: " + e.getMessage());
        }
        return users;
    }


    private static Set<String> getActiveFemaleName(List<UserDetails> users) {
        Set<String> names = new HashSet<>();
        for (UserDetails user : users) {
            if (user.isActive() && user.getGender().equalsIgnoreCase("female")) {
                names.add(user.getName());
            }
        }
        return names;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        validateCredentials(username, password);

        List<UserDetails> users = getAllUsers();
        Set<String> activeFemales = getActiveFemaleName(users);

        System.out.println("Active Female Users:");
        for (String name : activeFemales) {
            System.out.println(name);
        }
    }
}


class UserDetails {
    int id;
    String name;
    String username;
    String password;
    String gender;
    boolean isActive;

    public UserDetails(int id, String name, String username, String password, String gender, boolean isActive) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getGender() {
        return gender;
    }
}


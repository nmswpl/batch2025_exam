package in.co.nmsworks.week4.day1;

import com.google.gson.Gson;
import java.sql.*;

public class UpdateMoviesJson {


    static class MovieFull {
        int id;
        String name;
        int year_of_release;
        String genre;

        public MovieFull(int id, String name, int year_of_release, String genre) {
            this.id = id;
            this.name = name;
            this.year_of_release = year_of_release;
            this.genre = genre;
        }
    }

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/training";
        String username = "nms-training";
        String password = "nms-training";

        Gson gson = new Gson();

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password)) {


            String selectSQL = "SELECT id, name, year_of_release, genre FROM movies";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL);


            String updateSQL = "UPDATE movies SET json_string = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(updateSQL);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int year = rs.getInt("year_of_release");
                String genre = rs.getString("genre");


                MovieFull movie = new MovieFull(id, name, year, genre);


                String jsonString = gson.toJson(movie);


                pstmt.setString(1, jsonString);
                pstmt.setInt(2, id);
                pstmt.executeUpdate();

                System.out.println("Updated id " + id + " with JSON: " + jsonString);
            }

            System.out.println("All records updated successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

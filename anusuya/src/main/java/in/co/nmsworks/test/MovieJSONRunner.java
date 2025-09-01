package in.co.nmsworks.test;

import com.google.gson.Gson;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieJSONRunner {

    public static void main(String[] args) {

        MovieJSONRunner mr = new MovieJSONRunner();

        List<MovieJSON> movieList = mr.readFromDbB();

        List<String> movieJsonString = mr.convertingIntoJsonString(movieList);

       //mr.inertJsonStringToDb(movieJsonString,movieList);
    }

    private List<MovieJSON> readFromDbB() {

        List<MovieJSON> tempMovieSet = new ArrayList<>();

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT moviename,yearOfRelease,genre FROM Movies")){

            while(rs.next()){
                tempMovieSet.add(new MovieJSON(rs.getString(1),rs.getInt(2),rs.getString(3)));
            }
        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tempMovieSet;
    }

    private List<String> convertingIntoJsonString(List<MovieJSON> movieList){

        List<String> tempMovieJsonString = new ArrayList<>();
        Gson gson = new Gson();
        for (MovieJSON movie : movieList) {
            tempMovieJsonString.add(gson.toJson(movie));
        }
        return tempMovieJsonString;
    }

    private void inertJsonStringToDb(List<String> jsonString, List<MovieJSON> movieList) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
        PreparedStatement ps = con.prepareStatement("UPDATE Movies SET jsonstring=? WHERE moviename=?")) {

            int count = 0;
            for (MovieJSON movie : movieList) {
                ps.setString(1,jsonString.get(count++));
                ps.setString(2,movie.getName());
                ps.executeUpdate();
            }
        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

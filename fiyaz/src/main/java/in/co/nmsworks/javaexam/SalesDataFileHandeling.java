package in.co.nmsworks.javaexam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class SalesDataFileHandeling {
    public static void main(String[] args) {

        SalesDataFileHandeling salesDataFileHandeling = new SalesDataFileHandeling();

        salesDataFileHandeling.calculateAndPrintAvg("/home/nms-training/git/batch2025_exam/fiyaz/src/main/resources/SALES_DATA.csv");

        salesDataFileHandeling.SaleInfoOfHighestSoldProduct("/home/nms-training/git/batch2025_exam/fiyaz/src/main/resources/SALES_DATA.csv");

    }

    private void SaleInfoOfHighestSoldProduct(String fileName) {
    }




    private void calculateAndPrintAvg(String fileName) {

        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "nms-training";

        String sql = "insert into SalesInfo values (?,?,?,?,?,?)";

        try (
                Connection connection = DriverManager.getConnection(url,user,password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                preparedStatement.setInt(1, Integer.parseInt(str[0]));
                preparedStatement.setString(2,str[1]);
                preparedStatement.setString(3,str[2]);
                preparedStatement.setInt(4, Integer.parseInt(str[3]));
                preparedStatement.setInt(5, Integer.parseInt(str[4]));
                preparedStatement.setDate(6, Date.valueOf(str[5]));
                preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

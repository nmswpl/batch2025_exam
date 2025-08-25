package in.co.nmsworks.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class SalesInfo {
    public static void main(String[] args) {
        SalesInfo salesInfo = new SalesInfo();
        salesInfo.averagePrice("/home/nms-training/git/batch2025_exam/madhanakumar/src/main/resources/SALES_DATA.csv");
    }

    private void averagePrice(String filename) {
        try(BufferedReader bw = new BufferedReader(new FileReader(filename));
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement("INSERT TABLE SaleInfo INTO Values (?,?,?,?,?,?)");
            PreparedStatement ps1 = con.prepareStatement("Select DISTINCT category, AVG(price) from SalesInfo GROUP BY category;")) {
            bw.readLine();
            String lines;
            SalesPersistor salesPersistor = null;
            while ((lines = bw.readLine()) != null) {
                String[] strings = lines.split(",");
                salesPersistor = new SalesPersistor(strings[0], strings[1], strings[2], Double.parseDouble(strings[3]), Double.parseDouble(strings[4]), strings[5]);
            }
            ps.setString(1,salesPersistor.getSales_id());
            ps.setString(2,salesPersistor.getProduct_name());
            ps.setString(3,salesPersistor.getCategory());
            ps.setDouble(4,salesPersistor.getPrice());
            ps.setDouble(5,salesPersistor.getItems_sold());
            ps.setString(6,salesPersistor.getSale_date());
            ps.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        } finally {

        }
    }
}

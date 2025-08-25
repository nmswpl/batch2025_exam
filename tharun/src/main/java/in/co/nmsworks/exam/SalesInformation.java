package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesInformation {
    public static void main(String[] args) {
        SalesInformation sales = new SalesInformation();
        List<String[]> file = sales.readFromCsv();
        //sales.JdbcCreation(file);
        sales.printAveragePrice();
        //sales.highestSoldProduct();

    }

    private void highestSoldProduct() {
        String query = "SELECT PRODUCT_NAME , MAX(ITEMS_SOLD * PRICE),SALE_DATE FROM SALES_DATA GROUP BY SALE_DATE; ";
        ResultSet rs = null;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             PreparedStatement ps = con.prepareStatement(query))
        {
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t" + rs.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printAveragePrice() {
        String query = "SELECT AVG(PRICE) , CATEGORY FROM SALES_DATA GROUP BY CATEGORY;";
        ResultSet rs = null;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             PreparedStatement ps = con.prepareStatement(query))
        {
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getFloat(1)+"\t" + rs.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void JdbcCreation(List<String[]> file) {
        String query = "INSERT INTO SALES_DATA VALUES (?,?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             PreparedStatement ps = con.prepareStatement(query))
        {
            int count = 0;
            for (String[] rows : file) {
                if (count == 0){
                    count ++;
                    continue;
                }
                System.out.println(Arrays.toString(rows));

                int items = Integer.parseInt(rows[4].trim());
                ps.setString(1,rows[0]);
                ps.setString(2,rows[1]);
                ps.setString(3,rows[2]);
                ps.setFloat(4, Float.parseFloat(rows[3]));
                ps.setInt(5, items);
                ps.setString(6,rows[5]);
                ps.executeUpdate();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String[]> readFromCsv() {
        List<String[]> file = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/git/batch2025_exam/tharun/src/main/resources/SALES_DATA.csv")))
        {
            String line ;
            while ((line = br.readLine()) != null){
                String[] lineToArray = line.split(",");
                file.add(lineToArray);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  file;
    }

}

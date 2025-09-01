package in.co.nmsworks.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SalesInfo {
    public static void main(String[] args) {
        SalesInfo salesInfo = new SalesInfo();
//        salesInfo.averagePrice("/home/nms-training/git/batch2025_exam/madhanakumar/src/main/resources/SALES_DATA.csv");
        salesInfo.highestSoldProduct();
    }

    private void averagePrice(String filename) {
        try(BufferedReader bw = new BufferedReader(new FileReader(filename));
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement("INSERT INTO SalesInfo Values (?,?,?,?,?,?)");
            PreparedStatement ps1 = con.prepareStatement("Select DISTINCT category, AVG(price) as Average_price from SalesInfo GROUP BY category;")) {
            bw.readLine();

//            String lines;
//            while ((lines = bw.readLine()) != null) {
////                String[] strings = lines.split(",");
////                SalesPersistor salesPersistor = new SalesPersistor(strings[0], strings[1], strings[2], Double.parseDouble(strings[3]), Double.parseDouble(strings[4]), strings[5]);
////                ps.setString(1,salesPersistor.getSales_id());
////                ps.setString(2,salesPersistor.getProduct_name());
////                ps.setString(3,salesPersistor.getCategory());
////                ps.setDouble(6,salesPersistor.getPrice());
////                ps.setDouble(4,salesPersistor.getItems_sold());
////                DateTimeFormatter convert = DateTimeFormatter.ofPattern("dd-MM-yyyy");
////                LocalDate date = LocalDate.parse(salesPersistor.getSale_date().trim(),convert);
////                Date sql = java.sql.Date.valueOf(date);
////                ps.setDate(5,sql);
////                ps.executeUpdate();
//            }
            ResultSet rs = ps1.executeQuery();
            while (rs.next()){
                String category = rs.getString("category");
                double averagePrice = rs.getDouble("Average_price");
                System.out.println("Category : "+category+",\t Average Price : "+averagePrice);
            }
            rs.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private void highestSoldProduct(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement("Select DATE_FORMAT(sale_date,'%Y-%m') as Sale_Month, product_name, SUM(items_sold * price) as total_sale_value from SalesInfo Group by Sale_Month, product_name ORDER BY Sale_Month, total_sale_value DESC")){
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                String sale_Month = rs.getString("Sale_Month");
                String productName = rs.getString("product_name");
                double total_sale_value = rs.getDouble("total_sale_value");
                System.out.println("Sale_Month :"+sale_Month +", Product_Name : "+productName +", Total_Sale_Value : "+total_sale_value);
            }
            rs.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

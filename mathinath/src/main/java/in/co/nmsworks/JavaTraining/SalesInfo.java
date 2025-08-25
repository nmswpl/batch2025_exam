package in.co.nmsworks.JavaTraining;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalesInfo {
    int sales_id;
    String product_name;
    String category;
    int price;
    int items_sold;
    String salesDate;

    public SalesInfo() {
    }

    public SalesInfo(int sales_id, String product_name, String category, int price, int items_sold, String salesDate) {
        this.sales_id = sales_id;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
        this.items_sold = items_sold;
        this.salesDate = salesDate;
    }

    public int getSales_id() {
        return sales_id;
    }

    public void setSales_id(int sales_id) {
        this.sales_id = sales_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getItems_sold() {
        return items_sold;
    }

    public void setItems_sold(int items_sold) {
        this.items_sold = items_sold;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    @Override
    public String toString() {
        return "SalesInfo{" +
                "sales_id=" + sales_id +
                ", product_name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", items_sold=" + items_sold +
                ", salesDate='" + salesDate + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SalesInfo salesInfo = new SalesInfo();
        List<String> list = new ArrayList<>();
        salesInfo.highestSoldProduct();
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/git/batch2025_exam/mathinath/src/main/resources/SALES_DATA.csv"));
            String line;
            int averagePrice = 0;
            int count = 0;
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
                count++;
                String[] arr = line.split(",");
                for (String s : arr) {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement("insert into salesinfo values(?,?,?,?,?,?)");
            ps.setInt(1,salesInfo.getSales_id());
            ps.setString(2,salesInfo.getProduct_name());
            ps.setString(3,salesInfo.getCategory());
            ps.setInt(4,salesInfo.getPrice());
            ps.setInt(5,salesInfo.getItems_sold());
            ps.setString(6,salesInfo.getSalesDate());
            SalesInfo salesInfo1 = new SalesInfo(salesInfo.sales_id, salesInfo.product_name,salesInfo.category,salesInfo.price,salesInfo.items_sold,salesInfo.salesDate);
            list.add(String.valueOf(salesInfo1));
            ps.executeUpdate();



                }
//                salesInfo.calculateAndPrintAveragePrice(line,count);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }


    }

    private void calculateAndPrintAveragePrice(String line, int count) {
        int avgSal = 0;
    }

    private void highestSoldProduct() {
        int price_Sold = items_sold * price;

    }


}

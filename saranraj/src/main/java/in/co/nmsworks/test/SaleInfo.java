package in.co.nmsworks.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SaleInfo {
    private String sales_id;
    private String product_name;
    private String category;
    private double price;
    private int itemSold;
    private String salesDate;

    public String getSales_id() {
        return sales_id;
    }

    public void setSales_id(String sales_id) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemSold() {
        return itemSold;
    }

    public void setItemSold(int itemSold) {
        this.itemSold = itemSold;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public SaleInfo(String sales_id, String product_name, String category, double price, int itemSold, String salesDate) {
        this.sales_id = sales_id;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
        this.itemSold = itemSold;
        this.salesDate = salesDate;
    }

    @Override
    public String toString() {
        return "SaleInfo{" +
                "sales_id=" + sales_id +
                ", product_name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", itemSold=" + itemSold +
                ", salesDate='" + salesDate + '\'' +
                '}';
    }

    public SaleInfo() {
    }

    public static void main(String[] args) {
        SaleInfo si = new SaleInfo();
        List<SaleInfo> lisOfSales = si.getDataFromFile();
        System.out.println(lisOfSales.toString());
//        si.addToDb(lisOfSales);
        si.calculatePriceOfEachCaetgory(lisOfSales);

    }

    private void calculatePriceOfEachCaetgory(List<SaleInfo> lisOfSales) {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training")
        ) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }

        private void addToDb(List<SaleInfo> lisOfSales) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = conn.prepareStatement("insert into sales(sales_id, product_name, category, price, item_sold, sales_date) values(?,?,?,?,?,?)")) {

            int count = 0;
            for (SaleInfo s : lisOfSales) {
                ps.setString(1, s.getSales_id());
                ps.setString(2, s.getProduct_name());
                ps.setString(3, s.getCategory());
                ps.setDouble(4, s.getPrice());
                ps.setInt(5, s.getItemSold());
                ps.setString(6, s.getSalesDate());
                count += ps.executeUpdate();
            }
            System.out.println("Row inserted :" + count);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<SaleInfo> getDataFromFile() {
        List<SaleInfo> listOfSalesData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/git/batch2025_exam/saranraj/src/main/resources/SALES_DATA.csv"))) {
            br.readLine();
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] sales = line.trim().replaceAll(" ", "").split(",");
                String sales_id = sales[0].trim();
                String product_name = sales[1].trim();
                String category = sales[2].trim();
                double price = Double.parseDouble(sales[3].trim());
                int items_sold = Integer.parseInt(sales[4].trim());
                String sales_date = sales[5].trim();
                SaleInfo s = new SaleInfo(sales_id, product_name, category, price, items_sold, sales_date);
                System.out.println(s.toString());
                listOfSalesData.add(s);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listOfSalesData;
    }
}

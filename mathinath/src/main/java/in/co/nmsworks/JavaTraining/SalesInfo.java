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

    }

    private void calculateAndPrintAveragePrice(String line, int count) {
        int avgSal = 0;
    }

    private void highestSoldProduct() {
        int price_Sold = items_sold * price;

    }


}

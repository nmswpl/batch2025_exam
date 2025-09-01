package in.co.nmsworks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class SalesInformation {
    private int sales_id;
    private String productName;
    private String category;
    private int price;
    private int date;
    private int items_sold;

    public SalesInformation() {
        this.sales_id = sales_id;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.date = date;
    }

    public SalesInformation(int salesId, String productName, double v, int price, int date) {

    }

    public int getSales_id() {
        return sales_id;
    }

    public void setSales_id(int sales_id) {
        this.sales_id = sales_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public String setCategory(String category) {
        this.category = category;
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        this.price = price;
        return price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SalesInformation that = (SalesInformation) o;
        return sales_id == that.sales_id && price == that.price && date == that.date && Objects.equals(productName, that.productName) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sales_id, productName, category, price, date);
    }

    @Override
    public String toString() {
        return "SalesInformation{" +
                "sales_id=" + sales_id +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public void CalculateAndPrint(){
        int calculate= Integer.parseInt(productName+price);
        System.out.println("CalculateAndPrint : "+ "/n" +"ProdactName : "+productName+"price : "+price);
    }

    public void findAndSalesInfo(String category,int price ){
        Map<String,Integer> avg=new HashMap<>();

         int avgCalculation = items_sold * price;
         avg.put(category,price);
        System.out.println("********");
        System.out.println("Average Calculation : "+avgCalculation);
        System.out.println("CalculateAndPrint : "+toString());
    }

    public List<SalesInformation> showDataTwoRows(List<SalesInformation> salesInformation) {
//        String sql="INSERT INTO salesDetails Values(?,?,?,?,?,?)";
        String sql = "Select category,price from salesDetails;";
        List<Integer> list = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/git/batch2025_exam/logeswari/src/main/resources/SALES_DATA.csv"))) {
            try (PreparedStatement preparedStatement = con.prepareStatement(sql);
                 ResultSet rs = preparedStatement.getResultSet()) {
//                Map<String,Integer> avg=new HashMap<>();
                String line = "";
                while ((br.readLine()) != null) {
                    String[] word = line.split(",");
                    line.trim();

                    String category=setCategory(rs.getNString(2));
                    int price=setPrice(rs.getInt(3));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (List<SalesInformation>) readDate();


    }

    private Map<Object, Object> readDate() {

        return readDate();
    }


}

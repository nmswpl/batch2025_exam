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
//import java.io.*;
//        import java.util.*;
//
//class SaleInfo {
//    int id;
//    String category;
//    String product;
//    int itemsSold;
//    double price;
//    String month;
//
//    public SaleInfo(int id, String category, String product, int itemsSold, double price, String month) {
//        this.id = id;
//        this.category = category;
//        this.product = product;
//        this.itemsSold = itemsSold;
//        this.price = price;
//        this.month = month;
//    }
//
//    public double totalSale() {
//        return itemsSold * price;
//    }
//}
//
//public class SalesInfoProcessor {
//    public static void main(String[] args) throws Exception {
//        List<SaleInfo> sales = loadSales("Sales_data.csv");
//
//        printAveragePricePerCategory(sales);
//        printHighestSoldProductPerMonth(sales);
//    }
//
//    private static List<SaleInfo> loadSales(String file) throws Exception {
//        List<SaleInfo> list = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line;
//            br.readLine(); // skip header
//            while ((line = br.readLine()) != null) {
//                String[] parts = line.split(",");
//                list.add(new SaleInfo(
//                        Integer.parseInt(parts[0]),
//                        parts[1],
//                        parts[2],
//                        Integer.parseInt(parts[3]),
//                        Double.parseDouble(parts[4]),
//                        parts[5]
//                ));
//            }
//        }
//        return list;
//    }
//
//    private static void printAveragePricePerCategory(List<SaleInfo> sales) {
//        Map<String, List<Double>> categoryMap = new HashMap<>();
//        for (SaleInfo s : sales) {
//            categoryMap.computeIfAbsent(s.category, k -> new ArrayList<>()).add(s.price);
//        }
//
//        for (String category : categoryMap.keySet()) {
//            List<Double> prices = categoryMap.get(category);
//            double avg = prices.stream().mapToDouble(Double::doubleValue).average().orElse(0);
//            System.out.println("Category: " + category + " Avg Price: " + avg);
//        }
//    }
//
//    private static void printHighestSoldProductPerMonth(List<SaleInfo> sales) {
//        Map<String, SaleInfo> monthMap = new HashMap<>();
//        for (SaleInfo s : sales) {
//            monthMap.compute(s.month, (m, currentMax) ->
//                    (currentMax == null || s.totalSale() > currentMax.totalSale()) ? s : currentMax
//            );
//        }
//
//        for (String month : monthMap.keySet()) {
//            SaleInfo s = monthMap.get(month);
//            System.out.println("Month: " + month + " -> " + s.product + " (" + s.totalSale() + ")");
//        }
//    }
//}

package in.co.nmsworks.test;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class SaleInfo {
    String productName, category;
    double price;
    int itemsSold;
    LocalDate date;

    SaleInfo(String productName, String category, double price, int itemsSold, LocalDate date) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.itemsSold = itemsSold;
        this.date=date;
    }

    double getTotalSales() {
        return price * itemsSold;
    }

    String getMonth() {
        return date.toString().substring(0, 7); // "YYYY-MM"
    }

    public String toString() {
        return productName + " | " + category + " | " + price + " | Sold: " + itemsSold + " | Date: " + date;
    }
}

public class SalesProcessor {

    static List<SaleInfo> readSalesData(String path) {
        List<SaleInfo> sales = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                sales.add(new SaleInfo(
                        p[0], p[1],
                        Double.parseDouble(p[2]),
                        Integer.parseInt(p[3]),
                        LocalDate.parse(p[4])
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sales;
    }

    static void printAveragePriceByCategory(List<SaleInfo> sales) {
        Map<String, List<Double>> map = new HashMap<>();

        for (SaleInfo s : sales)
            map.computeIfAbsent(s.category);


        System.out.println("Average Price by Category:");
        for (String cat : map.keySet()) {
            List<Double> prices = map.get(cat);
            double avg = prices.stream().findAny().orElse(0);
            System.out.println(avg);

        }
    }

    static void printHighestSoldProductPerMonth(List<SaleInfo> sales) {
        Map<String, SaleInfo> best = new HashMap<>();

        for (SaleInfo s : sales) {
            String month = s.getMonth();
            if (!best.containsKey(month) || s.getTotalSales() > best.get(month).getTotalSales()) {
                best.put(month, s);
            }
        }

        System.out.println("Highest Sold Product monthwice");
        for (String m : best.keySet()) {
            System.out.println(m + best.get(m));
        }
    }

    public static void main(String[] args) {
        String filePath = "/home/nms-training/git/batch2025_exam/kavi/src/main/resources/SALES_DATA.csv";
        List<SaleInfo> sales = readSalesData(filePath);

        if (!sales.isEmpty()) {
            printAveragePriceByCategory(sales);
            printHighestSoldProductPerMonth(sales);
        } else {
            System.out.println("not fouund");
        }
    }
}
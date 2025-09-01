package in.co.nmsworks.retest;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class SalesAnalysisAlt {

    static class SaleInfo {
        String productId;
        String productName;
        String category;
        LocalDate date;
        int itemsSold;
        double price;

        public SaleInfo(String productId, String productName, String category,
                        LocalDate date, int itemsSold, double price) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
            this.date = date;
            this.itemsSold = itemsSold;
            this.price = price;
        }

        public double getTotalSales() {
            return itemsSold * price;
        }

        @Override
        public String toString() {
            return productName + " (" + productId + "), Category: " + category +
                    ", Date: " + date + ", Items Sold: " + itemsSold +
                    ", Price: " + price + ", Total Sales: " + getTotalSales();
        }
    }


    public static List<SaleInfo> loadSales(String filename) {
        List<SaleInfo> sales = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String id = data[0].trim();
                String name = data[1].trim();
                String category = data[2].trim();

                LocalDate date = LocalDate.parse(data[3].trim());
                int sold = Integer.parseInt(data[4].trim());
                double price = Double.parseDouble(data[5].trim());
                sales.add(new SaleInfo(id, name, category, date, sold, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sales;
    }


    public static void printAvgPriceByCategory(List<SaleInfo> sales) {
        Map<String, Double> totalPrice = new HashMap<>();
        Map<String, Integer> counts = new HashMap<>();

        for (SaleInfo s : sales) {
            totalPrice.put(s.category, totalPrice.getOrDefault(s.category, 0.0) + s.price);
            counts.put(s.category, counts.getOrDefault(s.category, 0) + 1);
        }

        System.out.println("Average Price per Category:");
        for (String category : totalPrice.keySet()) {
            double avg = totalPrice.get(category) / counts.get(category);
            System.out.printf("%s: %.2f%n", category, avg);
        }
    }


    public static void printHighestSoldProductPerMonth(List<SaleInfo> sales) {
        Map<String, SaleInfo> bestSales = new HashMap<>();

        for (SaleInfo s : sales) {
            String month = s.date.getYear() + "-" + String.format("%02d", s.date.getMonthValue());
            SaleInfo currentBest = bestSales.get(month);
            if (currentBest == null || s.getTotalSales() > currentBest.getTotalSales()) {
                bestSales.put(month, s);
            }
        }

        System.out.println("\nHighest Sold Products per Month:");
        for (String month : bestSales.keySet()) {
            System.out.println(month + ": " + bestSales.get(month));
        }
    }

    public static void main(String[] args) {
        String filename = "Sales_data.csv";
        List<SaleInfo> sales = loadSales(filename);

        printAvgPriceByCategory(sales);
        printHighestSoldProductPerMonth(sales);
    }
}

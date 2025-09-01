package in.co.nmsworks.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesAnalysis {
    private void calculatePriceOfEachCategory(List<SalesInfo> lisOfSales) {

        Map<String, double[]> categoryAndPrice = new HashMap<>();
        for (SalesInfo s : lisOfSales) {
            String category = s.getCategory();
            double price = s.getPrice();
            if (!categoryAndPrice.containsKey(category)) {
                categoryAndPrice.put(category, new double[]{price, 1});
            } else {
                categoryAndPrice.get(category)[0] += price;
                categoryAndPrice.get(category)[1] += 1;
            }
        }
        for (String category : categoryAndPrice.keySet()) {
            double[] data = categoryAndPrice.get(category);
            double averagePrice = data[0] / data[1];

            System.out.println("Category :" + category + " -> " + averagePrice);
        }
    }


    private List<SalesInfo> getDataFromFile() {
        List<SalesInfo> listOfSalesData = new ArrayList<>();
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
                SalesInfo s = new SalesInfo(sales_id, product_name, category, price, items_sold, sales_date);
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

    public static void main(String[] args) {
        SalesInfo si = new SalesInfo();
        SalesAnalysis sa = new SalesAnalysis();
        List<SalesInfo> lisOfSales = sa.getDataFromFile();
        System.out.println(lisOfSales.toString());
//        sa.addToDb(lisOfSales);
        sa.calculatePriceOfEachCategory(lisOfSales);

    }
}

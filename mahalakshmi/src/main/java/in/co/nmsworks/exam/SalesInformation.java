package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesInformation {

    public static void main(String[] args) throws IOException {
        SalesInformation si = new SalesInformation();
        String fileName = "/home/nms-training/git/batch2025_exam/mahalakshmi/src/main/resources/SALES_DATA.csv";
        List<Sale> sales = si.getSalesDataFromFile(fileName);

        System.out.println("Average price for Each Category: " + si.getAvgForEachCategory(sales));
    }

    public List<Sale> getSalesDataFromFile(String fileName) throws IOException {
        List<Sale> saleList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] strArr = line.split(",");
                saleList.add(new Sale(strArr[0],strArr[1],strArr[2],Double.parseDouble(strArr[3]),Integer.parseInt(strArr[4].trim()),strArr[5]));
            }
        }
        return saleList;
    }

    public Map<String,Double> getAvgForEachCategory(List<Sale> saleList) {
        Map<String ,List<Double>> avgCategory = new HashMap<>();
        for (Sale sale : saleList) {
            Double price = sale.getPrice();
            String category = sale.getCategory();
            avgCategory.putIfAbsent(category,new ArrayList<Double>());
            avgCategory.get(category).add(price);
            }

        Map<String,Double> avgCat = new HashMap<>();
        double avg = 0;
        for (Map.Entry<String, List<Double>> entry : avgCategory.entrySet()) {
            List<Double> priceList = entry.getValue();
            int sum = 0;
            for (Double v : priceList) {
                sum += v;
            }
            avg = (double) sum / priceList.size();
            avgCat.put(entry.getKey(),avg);
        }
        return avgCat;
    }

//    public Map<String,Double> SaleInfoOfHighestSoldProductInEachMonth(List<Sale> saleList) {
//        Map<Sale,Double> list = new HashMap<>();
//        List<Double> priceSold = new ArrayList<>();
//        for (Sale sale : saleList) {
//
//        }
//    }
}

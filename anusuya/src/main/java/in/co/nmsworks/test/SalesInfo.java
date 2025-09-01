package in.co.nmsworks.test;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesInfo {

    public static void main(String[] args) {

        SalesInfo si = new SalesInfo();

        String filename = "/home/nms-training/git/batch2025_exam/anusuya/src/main/resources/SALES_DATA.csv";
        List<SalesData> salesDataList = si.createSalesObject(filename);
        //System.out.println(salesDataList);

        si.calculateAndPrintAveragePriceForEachCategory(salesDataList);

        si.printSaleInfoOfHighestSoldProductForEachMonth(salesDataList);
    }

    private List<SalesData> createSalesObject(String filename) {

        List<SalesData> tempSalesDataList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){

            String line;
            br.readLine();
            while ((line = br.readLine()) != null){
                String[] splittedLine = line.split(",");
                tempSalesDataList.add(new SalesData(splittedLine[0].trim(),splittedLine[1].trim(),splittedLine[2].trim(),Double.parseDouble(splittedLine[3].trim()),Integer.parseInt(splittedLine[4].trim()),splittedLine[5].trim()));
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tempSalesDataList;
    }

    private void calculateAndPrintAveragePriceForEachCategory(List<SalesData> salesDataList) {

       Map<String, Double> categoryBasedPriceMap = new HashMap<>();
       Map<String, Integer> countCategory = new HashMap<>();

        for (SalesData salesData : salesDataList) {
            categoryBasedPriceMap.put(salesData.getCategory(), categoryBasedPriceMap.getOrDefault(salesData.getCategory(), salesData.getPrice()) + salesData.getPrice());
            countCategory.put(salesData.getCategory(), countCategory.getOrDefault(salesData.getCategory(), 0) + 1);
        }

        System.out.println("\nCATEGORY WISE AVERAGE PRICE : ");
        for (Map.Entry<String, Double> category : categoryBasedPriceMap.entrySet()) {
            double avg = category.getValue()/countCategory.get(category.getKey());
            System.out.println(category.getKey() + " = " + avg);
        }
    }

    private void printSaleInfoOfHighestSoldProductForEachMonth(List<SalesData> salesDataList) {

        Map<String, SalesData> highestSoldProductBasedOnMonthMap = new HashMap<>();

        for (SalesData salesData : salesDataList) {
            double price = salesData.getPrice()*salesData.getNoOfItemSold();
            String month = salesData.getSalesDate().substring(3,5);
            if(highestSoldProductBasedOnMonthMap.containsKey(month)){
                double temp = highestSoldProductBasedOnMonthMap.get(month).getPrice();
                if (price > temp){
                    highestSoldProductBasedOnMonthMap.put(month,salesData);
                }
            }
            else{
                highestSoldProductBasedOnMonthMap.put(month,salesData);
            }
        }
        System.out.println("\nHighest Sold Products in each month : ");
        for (Map.Entry<String, SalesData> stringSalesDataEntry : highestSoldProductBasedOnMonthMap.entrySet()) {
            System.out.println(stringSalesDataEntry.getKey() + " --> "+ stringSalesDataEntry.getValue());
        }
    }
}



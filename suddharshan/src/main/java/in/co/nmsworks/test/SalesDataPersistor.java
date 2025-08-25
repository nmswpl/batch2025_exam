package in.co.nmsworks.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SalesDataPersistor {

    public static void main(String[] args) {
        SalesDataPersistor sd = new SalesDataPersistor();
        sd.getAvgSalaryOfEachCategory("/home/nms-training/git/batch2025_exam/suddharshan/src/main/resources/SALES_DATA.csv");
        sd.findHighestProductSold("/home/nms-training/git/batch2025_exam/suddharshan/src/main/resources/SALES_DATA.csv");
    }

    public void getAvgSalaryOfEachCategory(String fileName){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String data;
            List<SalesData> salesDataList = new ArrayList<>();
            br.readLine();
            while((data = br.readLine()) != null) {
                String[] row = data.split(",");
                SalesData sd = new SalesData(row[0].trim(),row[1].trim(),row[2].trim(), Float.valueOf(row[3].trim()), Integer.parseInt(row[4].trim()),row[5].trim());
                salesDataList.add(sd);
            }
            Map<String, List<Float>> categoryPrice = new HashMap<>();
            for (SalesData salesData : salesDataList) {
                String category = salesData.getCategory();
                if(categoryPrice.containsKey(category)){
                    List <Float> updatedPrice = categoryPrice.get(category);
                    updatedPrice.add(salesData.getPrice());
                    categoryPrice.replace(category,updatedPrice);
                }
                else{
                    List <Float> priceList = new ArrayList<>();
                    priceList.add(salesData.getPrice());
                    categoryPrice.put(category,priceList);
                }
            }
            for (Map.Entry<String, List<Float>> entry : categoryPrice.entrySet()) {
                int length = entry.getValue().size();
                float sum = 0;
                for (Float v : entry.getValue()) {
                    sum += v;
                }
                System.out.println(entry.getKey() + " average price is: " + sum/length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findHighestProductSold(String fileName){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String data;
            List<SalesData> salesDataList = new ArrayList<>();
            br.readLine();
            while((data = br.readLine()) != null) {
                String[] row = data.split(",");
                SalesData sd = new SalesData(row[0].trim(),row[1].trim(),row[2].trim(), Float.valueOf(row[3].trim()), Integer.parseInt(row[4].trim()),row[5].trim());
                salesDataList.add(sd);
            }
            Map <String,Float> highestPriceInMonth = new HashMap<>();
            for (SalesData salesData : salesDataList) {
                String date = salesData.getDate();
                String[] monthArr = date.split("-");
                if(highestPriceInMonth.containsKey(monthArr[1])){
                    float newPrice = salesData.getItemsSold()*salesData.getPrice();
                    if(newPrice > highestPriceInMonth.get(monthArr[1])){
                        highestPriceInMonth.replace(monthArr[1],newPrice);
                    }
                }
                else{
                    highestPriceInMonth.put(monthArr[1],salesData.getItemsSold()*salesData.getPrice());
                }
            }
            System.out.println(highestPriceInMonth);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

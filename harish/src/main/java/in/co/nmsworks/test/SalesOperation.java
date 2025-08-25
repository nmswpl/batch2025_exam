package in.co.nmsworks.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SalesOperation {
    public static void main(String[] args) {
        SalesOperation so = new SalesOperation();
        List<SalesInfo> salesInfos = so.objectCreatiionFromFiles("/home/nms-training/git/batch2025_exam/harish/src/main/resources/SALES_DATA.csv");
        printAveragePriceOfEachCategory(salesInfos);
        printHighestSoldProductInEachMonth(salesInfos,04);
    }

    private static void printHighestSoldProductInEachMonth(List<SalesInfo> salesInfos, int month) {
        int highestProductSold = 0;
        String productName = "";
        for (SalesInfo salesInfo : salesInfos) {
            String date = salesInfo.getDate();
            String[] months = date.split("-");
            int monthss = Integer.parseInt(months[1]);
            int priceSold;
            if (monthss == month){
                priceSold = salesInfo.getItemSold() * salesInfo.getItemSold();
                if( priceSold > highestProductSold){
                    highestProductSold = priceSold;
                    productName = salesInfo.getProductName();
                }
            }
        }
        System.out.println("Highest Sold Product in "+ month +" month "+ productName);
    }

    private static void printAveragePriceOfEachCategory(List<SalesInfo> salesInfos) {
        Set<String> category = new HashSet<>();
        for (SalesInfo salesInfo : salesInfos) {
           category.add(salesInfo.getCategory());
        }
        for (String s : category) {
            double price = 0;
            int count = 0;
            for (SalesInfo salesInfo : salesInfos) {
                if (salesInfo.getCategory().equals(s)){
                    price = price + salesInfo.getPrice();
                    count ++;
                }
            }
            System.out.println("Average price of :" + s + " : " +price/count);
        }
    }

    private List<SalesInfo> objectCreatiionFromFiles(String fileName) {
        List<SalesInfo> sales = new ArrayList<>();
       try( BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
           bufferedReader.readLine();
           String row;
           while ((row = bufferedReader.readLine()) != null){
               System.out.println(row);
               String[] splitRow = row.split(" , ");
               SalesInfo salesInfo = new SalesInfo(splitRow[0],splitRow[1],splitRow[2],Double.parseDouble(splitRow[3]),Integer.parseInt(splitRow[4]),splitRow[5]);
               sales.add(salesInfo);
           }
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       return sales;
    }
}

package in.co.nmsworks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class SalesInformation {
    String defaultSales_id = "0";
    String defaultProduct_name = "unknown";
    String defaultCategory = "unknown";
    String defaultPrize = "000.0";
    String defaultItemSold = "111";
    String defaultSold_date = "00-00-0000";

    public static void main(String[] args) {
        SalesInformation sInfo = new SalesInformation();
        List<Sales> fetchData = sInfo.fetchFromFile("/home/nms-training/git/batch2025_exam/kabilkumar/src/main/resources/SALES_DATA.csv");
        sInfo.fetchCategoryWisePrize(fetchData);
        sInfo.highestSoldInMonthWise(fetchData);

    }

    public List<Sales> fetchFromFile(String fileName) {
        List<Sales> salesDetails = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String Line;
            br.readLine();
            while ((Line = br.readLine()) != null) {
                String[] split = Line.split(" , ");
                String sales_id = split[0];
                String product_name = split[1];
                String category = split[2];
                String prize = split[3];
                String itemSold = split[4];
                String sold_date = split[5];


                if (sales_id.trim().isEmpty()) {
                    sales_id = defaultSales_id;
                }
                if (product_name.trim().isEmpty()) {
                    product_name = defaultProduct_name;
                }
                if (category.trim().isEmpty()) {
                    category = defaultCategory;
                }

                if (prize.trim().isEmpty()) {
                    prize = defaultPrize;
                }
                if (itemSold.trim().isEmpty()) {
                    itemSold = defaultItemSold;
                }
                if (sold_date.trim().isEmpty()) {
                    sold_date = defaultSold_date;
                }

                Sales removeNullValues = new Sales(sales_id, product_name, category, Double.parseDouble(prize), Integer.parseInt(itemSold), sold_date);
                salesDetails.add(removeNullValues);

            }
            System.out.println(salesDetails);

            double totalPrize = 0;
            int avgSize = salesDetails.size();
            for (Sales sales : salesDetails) {

                totalPrize = Double.parseDouble(String.valueOf(totalPrize + sales.getPrice()));
            }

            System.out.println("Average of Total Prize :" + totalPrize % avgSize);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return salesDetails;
    }

    public void fetchCategoryWisePrize(List<Sales> fetchData) {
        Map<String, Double> categoryWise = new HashMap<>();
        for (Sales fetchDatum : fetchData) {
            categoryWise.put(fetchDatum.getCategory(), 0.0);

        }
        //  System.out.println(categoryWise);
        for (Map.Entry<String, Double> stringDoubleEntry : categoryWise.entrySet()) {
            double totalAvg = 0.0;
            int count = 0;
            for (Sales fetchDatum : fetchData) {

                if (fetchDatum.getCategory().equals(stringDoubleEntry.getKey())) {
                    totalAvg = totalAvg + fetchDatum.getPrice();
                    count++;
                }
            }
            //  System.out.println(stringDoubleEntry.getKey() + ":" + totalAvg / count);

            //  categoryWise.put(stringDoubleEntry.getKey(), totalAvg / count);
        }
        //  System.out.println(categoryWise);
    }

    public void highestSoldInMonthWise(List<Sales> fetchData) {
        Map<String, Integer> monthWiseSold = new HashMap<>();

        for (Sales fetchDatum : fetchData) {
            String[] split1 = fetchDatum.getSale_date().split("-");
            monthWiseSold.put(split1[1], 0);
        }
        //  System.out.println(monthWiseSold);
        for (Map.Entry<String, Integer> stringIntegerEntry : monthWiseSold.entrySet()) {

            double priceSold = 1;
            double highestProductSale = 0;
            String productName = "";
            for (Sales fetchDatum : fetchData) {
                String[] split2 = fetchDatum.getSale_date().split("-");
                if (stringIntegerEntry.getKey().equals(split2[1])) {

                    priceSold = fetchDatum.getPrice() * fetchDatum.getItems_sold();
                    if (priceSold > highestProductSale) {
                        productName = fetchDatum.getProduct_name();
                    }
                }
            }
            // System.out.println("Month :" + stringIntegerEntry.getKey() + " -->  " + priceSold + "Price sold -->The sale of the Product name :"+ productName);
        }
    }
}



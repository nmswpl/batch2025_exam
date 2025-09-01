package in.co.nmsworks.training_exam_2025;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesRunner
{
    public static void main(String[] args)
    {
        SalesRunner salesRunner = new SalesRunner();
        List<SaleInfo> saleInfoList = salesRunner.fileToListOfObject("/home/nms-training/git/batch2025_exam/gajendran/src/main/resources/SALES_DATA.csv");
        //salesRunner.printAvgBasedOnCategory(saleInfoList);
        salesRunner.highestSoldProductBasedOnMonth(saleInfoList);

    }

    private void highestSoldProductBasedOnMonth(List<SaleInfo> saleInfoList)
    {
        Map<String, Map<String, Float>> highestSoldProductBasedOnMonth = new HashMap<>();
        for (SaleInfo saleInfo : saleInfoList)
        {
            String productName = saleInfo.getProduct_name();
            float priceSold = saleInfo.getItems_sold() * saleInfo.getPrice();
            String[] month = saleInfo.getSale_date().split("-");

            if (highestSoldProductBasedOnMonth.containsKey(month[1]))
            {
                Map<String, Float> temp = highestSoldProductBasedOnMonth.get(month[1]);

                if (temp.containsKey(productName))
                {
                    temp.replace(productName,priceSold + temp.get(productName));
                }
                else
                {
                    temp.put(productName,priceSold);
                    highestSoldProductBasedOnMonth.put(month[1],temp);
                }
            }else
            {
                Map<String, Float> temp = new HashMap<>();
                temp.put(productName,priceSold);
                highestSoldProductBasedOnMonth.put(month[1],temp);
            }
        }
        for (Map.Entry<String, Map<String, Float>> month : highestSoldProductBasedOnMonth.entrySet())
        {
            String highestSoldProduct =  "";
            float totalPriceOfSold = 0 ;
            totalPriceOfSold = 0;
            for (Map.Entry<String, Float> productName : month.getValue().entrySet())
            {
                if (productName.getValue() > (totalPriceOfSold))
                {
                    highestSoldProduct = productName.getKey();
                    totalPriceOfSold = productName.getValue();
                }
            }
            System.out.println("Month : "+month.getKey()+"\tProduct Name : "+highestSoldProduct+"\t\tTotal of sold Price : "+totalPriceOfSold);
        }
    }

    private void printAvgBasedOnCategory(List<SaleInfo> saleInfoList)
    {
        Map<String, Float> sumOfPrice = new HashMap<>();
        Map<String, Integer> countForCategory = new HashMap<>();

        for (SaleInfo saleInfo : saleInfoList)
        {
            String tempCategory = saleInfo.getCategory();
            float tempPrice = saleInfo.getPrice();
            if (sumOfPrice.containsKey(saleInfo.getCategory()))
            {

                sumOfPrice.replace(tempCategory,(sumOfPrice.get(tempCategory) + saleInfo.getPrice()));
                countForCategory.replace(tempCategory,countForCategory.get(tempCategory)+1);
            }
            else
            {
                sumOfPrice.put(tempCategory,tempPrice);
                countForCategory.put(tempCategory,1);
            }
        }

        System.out.println("Category\t : \tAvg");
        for (String s : sumOfPrice.keySet())
        {
            System.out.println(s+"\t :\t "+sumOfPrice.get(s)/countForCategory.get(s));
        }

    }

    private  List<SaleInfo> fileToListOfObject(String fileName)  {
        List<SaleInfo> salesData = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)))
        {
            bufferedReader.readLine();
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] datas = data.split(",");
                salesData.add(new SaleInfo(datas[0].trim(), datas[1].trim(), datas[2].trim(), datas[5].trim(), Float.parseFloat(datas[3].trim()), Integer.parseInt(datas[4].trim())));

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return salesData;
    }
}

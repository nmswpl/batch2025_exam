package in.co.nmsworks.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaleInfo
{
    private List<SalesData> salesDataList = new ArrayList<>();
    Map<String, Double[]> avgPrice = new HashMap<>();

    public static void main(String[] args)
    {
        SaleInfo saleInfo = new SaleInfo();

        saleInfo.readFromFile("/home/nms-training/git/batch2025_exam/asik/src/main/resources/SALES_DATA.csv");

        //saleInfo.calculateAndPrintAvgPriceForEachCategory(saleInfo.salesDataList);

        saleInfo.findAndPrintHighestSoldProductInEachMonth(saleInfo.salesDataList);
    }

    private void findAndPrintHighestSoldProductInEachMonth(List<SalesData> salesDataList)
    {
        Map<Integer, String> soldProductPerMonth = new HashMap<>();
        for (SalesData salesData : salesDataList)
        {
            Integer month = Integer.parseInt(salesData.getSaleDate().split("-")[1]);
            soldProductPerMonth.put(month, soldProductPerMonth.getOrDefault(month, "") + salesData.getName());

        }


    }

    private void calculateAndPrintAvgPriceForEachCategory(List<SalesData> salesDataList)
    {
        for (SalesData salesData : salesDataList)
        {
            if (!avgPrice.containsKey(salesData.getCategory()))
            {
                avgPrice.put(salesData.getCategory(), new Double[]{1.0, salesData.getPrice()});
            }
            else
            {
                Double[] val = avgPrice.get(salesData.getCategory());
                val[0] = val[0] + 1;
                val[1] = val[1] + salesData.getPrice();
            }
        }

        for (Map.Entry<String, Double[]> entry : avgPrice.entrySet())
        {
            System.out.println("Average Price For " + entry.getKey() + " is " + entry.getValue()[1]/entry.getValue()[0]);
        }
    }

    private void readFromFile(String path)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null)
            {
                String[] salesDataArr = line.split(", ");

                int id = Integer.parseInt(salesDataArr[0].replace("-", "").trim());
                double price = Double.parseDouble(salesDataArr[3].trim());
                int itemsSold = Integer.parseInt(salesDataArr[4].trim());
                SalesData salesData = new SalesData(id, salesDataArr[1].trim(), salesDataArr[2].trim(), price, itemsSold, salesDataArr[5].trim());
                salesDataList.add(salesData);
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}

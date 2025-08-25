package in.co.nmsworks.training_exam_2025;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalesRunner
{
    public static void main(String[] args)
    {
        SalesRunner salesRunner = new SalesRunner();
        List<SaleInfo> saleInfoList = salesRunner.fileToListOfObject("/home/nms-training/git/batch2025_exam/gajendran/src/main/resources/SALES_DATA.csv");
        salesRunner.printAvgBasedOnCategory(saleInfoList);
    }

    private void printAvgBasedOnCategory(List<SaleInfo> saleInfoList)
    {
        
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

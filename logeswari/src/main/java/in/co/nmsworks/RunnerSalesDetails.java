package in.co.nmsworks;

import java.util.ArrayList;
import java.util.List;

public class RunnerSalesDetails {
    public static void main(String[] args) {
        List<SalesInformation> list=new ArrayList<>();

       ReadSalesData readSalesData = new ReadSalesData();
       SalesInformation si=new SalesInformation();
        System.out.println("*******");
       si.showDataTwoRows(si.showDataTwoRows(list));




//       readSalesData.shoReadDate();

//       readSalesData.readDate();
//        SalesInformation salesInformation=new SalesInformation(62-1937251 ," Pet Training Clicker ", 5.99 , 90 , 22-11-2024);
//        salesInformation.CalculateAndPrint();
//        salesInformation.findAndSalesInfo(salesInformation.getPrice(), salesInformation.getSales_id());
//        System.out.println("success******");
    }

}

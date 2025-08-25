package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sales {
    public static void main(String[] args) {
        Sales sale = new Sales();
        String filename = "/home/nms-training/git/batch2025_exam/arsath/src/main/resources/SALES_DATA.csv";
        List<SalesInfo> salesInfoList = sale.printAveragePrice(filename);

        sale.highestSoldItem(salesInfoList);
        
    }

    public List<SalesInfo> printAveragePrice(String filename){
        List<SalesInfo> salesInfoList = new ArrayList<>();
        List<Double> salesPrice = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line=br.readLine())!=null){
                String[] words = line.split(" , ");

                if(words[0].equals("sales_id")){
                    continue;
                }
                SalesInfo salesInfo = new SalesInfo(words[0],words[1],words[2],words[3],words[4],words[5]);
               if(!salesInfoList.contains(salesInfo)){
                   salesInfoList.add(salesInfo);
               }
                salesPrice.add(Double.parseDouble(salesInfo.getPrice()));
            }
            double sumOfPrices = 0;
            for (Double i : salesPrice) {
                sumOfPrices += i;
            }
            System.out.println("The Average Price: " + sumOfPrices/salesPrice.size());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return salesInfoList;
    }

    public void highestSoldItem(List<SalesInfo> salesInfoList){
        Map<List<SalesInfo>,Integer> countMap = new HashMap<>();

    }
}

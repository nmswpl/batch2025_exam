package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Sales {
    public static void main(String[] args) {
        Sales sale = new Sales();
        String filename = "/home/nms-training/git/batch2025_exam/arsath/src/main/resources/SALES_DATA.csv";
        sale.printAveragePricePerCategory(filename);
    }

    public List<SalesInfo> printAveragePricePerCategory(String filename){
        Map<String,List<Float>> prices = new HashMap<>();
        List<SalesInfo> salesInfoList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line=br.readLine())!=null){
                String[] titles = line.split(" ,");
//                System.out.println(Arrays.toString(titles));
                if(titles[3].contains("price")){
                    continue;
                }
                SalesInfo salesInfo = new SalesInfo(titles[0],titles[1],titles[2],titles[3],titles[4],titles[5]);
                salesInfoList.add(salesInfo);
                if(!prices.containsKey(titles[2])){
                    prices.put(titles[2], new ArrayList<>());
                }
                prices.get(titles[2]).add(Float.valueOf(titles[3]));
            }

            int sum = 0;
            for (String category : prices.keySet()) {
                List<Float> priceList = prices.get(category);
                for (Float v : priceList) {
                    sum += v;
                }
                float avg = sum / priceList.size();

                System.out.println(category + "->" + avg);
            }
            System.out.println(salesInfoList);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return salesInfoList;
    }

    public void highestSoldItem(List<SalesInfo> salesInfoList){
        Map<List<SalesInfo>,Integer> countMap = new HashMap<>();

    }
}

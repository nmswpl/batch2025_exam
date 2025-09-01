package in.co.nmsworks.Exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fileReader
{

    public static void main(String[] args)
    {
        fileReader fr = new fileReader();
        String filename = "/home/nms-training/git/batch2025_exam/subash/src/main/resources/SALES_DATA.csv";

//        List<SaleInfo> salesList = fr.readFile(filename);
        SalesToDBWriter sdb = new SalesToDBWriter();
//        sdb.readFileTODB(salesList);
        fr.calPerEachMonth(filename);
    }

    private List<SaleInfo> readFile(String filename)
    {
        List<SaleInfo> salesList = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(filename)))
        {
            String line = "";
            bf.readLine();

            while((line=bf.readLine())!=null)
            {
                String line1= line.replace(" ","");
                String[] arr = line1.split(",");
                String[] arr1 = arr[5].split("-");
                int month = Integer.parseInt(arr1[1]);
                salesList.add(new SaleInfo(arr[0],arr[1],arr[2],Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),arr[5]));
            }
            System.out.println(salesList);
            for (SaleInfo saleInfo : salesList) {
                System.out.println(saleInfo.toString());
            }

        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    return salesList;
    }

    private void calPerEachMonth(String filename)
    {
        Map<Integer,List<Double>> map1 = new HashMap<>();

            List<Double> salesList = new ArrayList<>();
            double sum=0;
            double max=0;
            int maxMonth=0;
            try (BufferedReader bf = new BufferedReader(new FileReader(filename)))
            {
                String line = "";
                bf.readLine();

                while((line=bf.readLine())!=null)
                {
                    String line1= line.replace(" ","");
                    String[] arr = line1.split(",");
                    String[] arr1 = arr[5].split("-");
                    int month = Integer.parseInt(arr1[1]);
                    map1.put(month,map1.computeIfAbsent(month,k -> new ArrayList<>())).add(Double.parseDouble(arr[3])*Integer.parseInt(arr[4]));
                }
                for (Map.Entry<Integer, List<Double>> entry : map1.entrySet()) {

                    for (Double v : entry.getValue())
                    {
                        sum=sum+v;
                        if(max<sum)
                        {
                            max=sum;
                            maxMonth= entry.getKey();
                        }
                    }

                }
                System.out.println("Max Price Month : "+maxMonth);
                System.out.println("Max Price In The Month: "+max);

            } catch (FileNotFoundException e)
            {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }


}

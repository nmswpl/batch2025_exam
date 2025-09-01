package in.co.nmsworks.exam2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFile
{
    public static void main(String[] args) {
        CSVFile csv = new CSVFile();
        String fileName = "/home/nms-training/Downloads/titanic.csv";

        List<Survied> fetchData = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {


            int sum = 0;
                String Line;
                br.readLine();
                while ((Line = br.readLine()) != null)
                {
                    String[] split = Line.split(",");
                    int num = Integer.parseInt(split[0]);
                   // System.out.println(num);
                    Survied storeData = new Survied(num);
                    fetchData.add(storeData);
               }

            System.out.println(fetchData);
            System.out.println(fetchData.size());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         int total = 0;
         int avg = fetchData.size();

        for (Survied fetchDatum : fetchData)
        {
           total = total + fetchDatum.getSurvived();
           avg++;

        }
        System.out.println("The Total Survival :"+ total);
        System.out.println("average "+(total / fetchData.size())*100);


    }
}

package in.co.nmsworks.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SaleMainClass {


    public static void main(String[] args) {

        List<Integer> list = readFromBufferedReader("/home/nms-training/git/batch2025_exam/viji/src/main/resources/SALES_DATA.csv");
        averagePrice(list);

    }

    public  static   List<Integer> readFromBufferedReader(String path) {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                String[] line1 = line.split(",");
                list.add(Integer.parseInt(line1[4]));
            }
        } catch (Exception e) {
         e.printStackTrace();;
        }
        return list ;

    }



    public  static void averagePrice(List<Integer> list) {
      int sum = 0;
      for(Integer l : list){
          sum += l ;
      }

      int average = sum / list.size() ;
      System.out.println("The average Price is : ");

    }
}

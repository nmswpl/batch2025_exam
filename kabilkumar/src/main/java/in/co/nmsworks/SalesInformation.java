package in.co.nmsworks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalesInformation {
    public static void main(String[] args) {
        SalesInformation sInfo = new SalesInformation();
        sInfo.getDataFormFile("/home/nms-training/git/batch2025_exam/kabilkumar/src/main/resources/SALES_DATA.csv");
    }

    public void getDataFormFile(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            List<String> data = new ArrayList<>();
            String Line;
            br.readLine();
            String s = null;
            while ((Line = br.readLine()) != null) {
                //System.out.println(Line);
                String[] split = Line.split(" , ");
                //  System.out.println(split[1]);

                s = new String(split[0] + " " + split[1] + " " + split[2] + " " + split[3] + " " + split[4]);

                data.add(s);
                double sum = 1;
                for (int i = 0; i < data.size(); i++) {
                    data.add(split[3]);
                    sum += data.indexOf(i);

                }
                System.out.println("nnn"+sum);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

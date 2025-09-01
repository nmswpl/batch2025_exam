package in.co.nmsworks.revise;

import javax.swing.event.ListSelectionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaleInfo {
    public static void main(String[] args) throws IOException {
        SaleInfo saleInfo = new SaleInfo();
        List<Sale> saleList = saleInfo.getAllDataFromFile("/home/nms-training/git/batch2025_exam/mahalakshmi/src/main/resources/SALES_DATA.csv");
        for (Sale sale : saleList) {
            System.out.println(sale);
        }
    }

    public List<Sale> getAllDataFromFile(String filaName) throws IOException {
        List<Sale> saleList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filaName))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] strArr = line.split(",");
                saleList.add(new Sale(strArr[0].trim(),strArr[1].trim(),strArr[2].trim(),Double.parseDouble(strArr[3].trim()),Integer.parseInt(strArr[4].trim()),strArr[5].trim()));
            }
        }
        return saleList;
    }

//    public List<String,Double> findAvgForEacgCatgory(List<Sale> saleList) {
//
//    }
}

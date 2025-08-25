package in.co.nmsworks.Test;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesInformation {
    public static void main(String[] args) throws FileNotFoundException {
        SalesInformation si = new SalesInformation();
        si.printAverage("Garden");




    }

    static List<SalesInfo> list = new ArrayList<>();

    public void printAverage(String category) throws FileNotFoundException {

        double avg;
        double sum = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/git/batch2025_exam/yamini/src/main/resources/SALES_DATA.csv"))) {
            String line;
            String result = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                result += line;
            }
            String[] arr = result.split(",");
            for (int i = 0; i < arr.length; i++) {
                list.add(new SalesInfo(arr[0], arr[1], arr[2], Double.parseDouble(arr[3])));
            }

            for (SalesInfo salesInfo : list) {

                count++;
                sum += salesInfo.getPrice();
            }
            avg = sum / count;
            System.out.println(avg);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void printHighest() {


    }


}

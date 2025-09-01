package in.co.nmsworks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        Runner r = new Runner();
//        Sales s =new Sales(22-3728298 , "Garlic Herb Seasoning" , "Food - Spices" , 1.99 , 88 , 24-12-2024);
//        System.out.println(s);
        fetchFromFile("/home/nms-training/git/batch2025_exam/kabilkumar/src/main/resources/SALES_DATA.csv");

    }
        public static  void fetchFromFile( String fileName)

        {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String Line;
            while ((Line=br.readLine()) != null)
            {
                String[] split = Line.split(", ");
                System.out.println(split);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
}

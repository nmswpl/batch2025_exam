package in.co.nmsworks.exam2;

import java.io.BufferedReader;
import java.io.FileReader;

public class TitanicRunner {
    public static void main(String[] args) {
        TitanicRunner titanicRunner = new TitanicRunner();
        titanicRunner.survivalCountAndPercentage("/home/nms-training/Downloads/titanic.csv");
    }

    public void survivalCountAndPercentage(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine();
            while((line = br.readLine()) != null){
                line.split(",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

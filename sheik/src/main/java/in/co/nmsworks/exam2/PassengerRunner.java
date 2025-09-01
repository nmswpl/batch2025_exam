package in.co.nmsworks.exam2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassengerRunner
{
    static String file =  "/home/nms-training/Downloads/";
    public static void main(String[] args) {


        List<Passanger> passangerList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line ;
            br.readLine();
            while ((line=br.readLine())!=null) {
                String[] str = line.split(",");
                passangerList.add(new Passanger(Integer.parseInt(str[0]),Integer.parseInt(str[1]),str[2],str[3],Integer.parseInt(str[4]),Integer.parseInt(str[5]),Integer.parseInt(str[6]),Float.parseFloat(str[7])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Map<Integer,List<Integer>> mapclassandSurvival = new HashMap<>();

        for (Passanger passanger : passangerList) {
            mapclassandSurvival.computeIfAbsent(passanger.getpcClass(),k->new ArrayList<>()).add(passanger.getSurvived());
        }

        for (Map.Entry<Integer, List<Integer>> integerListEntry : mapclassandSurvival.entrySet()) {
            int sum =0 ;
            for(Integer val : integerListEntry.getValue()){
                sum = val + sum ;
                System.out.println(integerListEntry.getKey() + "Survival count :" + sum );
                //System.out.println(integerListEntry.getKey() + sum/integerListEntry.getValue().size());
            }
        }


    }
}

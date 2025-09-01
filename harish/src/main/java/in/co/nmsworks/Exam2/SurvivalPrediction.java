package in.co.nmsworks.Exam2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SurvivalPrediction {
    public static void main(String[] args) {
        List<SurvivedPerson> survivedPerson = addSurvivedPersons("/home/nms-training/Downloads/titanic.csv");
        printClassWiseSurvivedPeopleCount(survivedPerson);
    }

    private static void printClassWiseSurvivedPeopleCount(List<SurvivedPerson> survivedPerson) {
        Map<Integer,Integer> classWiseSurvivedCount = new HashMap<>();
        for (SurvivedPerson person : survivedPerson) {
            classWiseSurvivedCount.put(person.getPcClass(),0);
        }
        for (Map.Entry<Integer, Integer> count : classWiseSurvivedCount.entrySet()) {
            int peopleCount = 0;
            for (SurvivedPerson person : survivedPerson) {
                if (person.pcClass == count.getKey()){
                    peopleCount ++;
                }
            }
            classWiseSurvivedCount.put(count.getKey(),count.getValue());
            System.out.println(classWiseSurvivedCount);
        }
    }

    private static List<SurvivedPerson> addSurvivedPersons(String s) {
        try(BufferedReader bf = new BufferedReader(new FileReader(s))){
            List<SurvivedPerson> peoples = new ArrayList<>();
            bf.readLine();
            String person;
            while ((person = bf.readLine()) != null){
                String[] sd = person.split(",");
                SurvivedPerson sp = new SurvivedPerson(Integer.parseInt(sd[0]),Integer.parseInt(sd[1]),sd[2],sd[3],Integer.parseInt(sd[4]),Integer.parseInt(sd[5]),Integer.parseInt(sd[6]),Double.parseDouble(sd[7]));
                peoples.add(sp);
            }
            return peoples;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

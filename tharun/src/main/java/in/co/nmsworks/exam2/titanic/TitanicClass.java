package in.co.nmsworks.exam2.titanic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TitanicClass {

    public static void main(String[] args) {
        TitanicClass titanicClass = new TitanicClass();
        List<PeopleDetails> peopleDetailsObject = titanicClass.listCreation();
        System.out.println(peopleDetailsObject);
        int age = 30;
        titanicClass.printNameAndOthers(peopleDetailsObject,age);

        titanicClass.survivalPercentage(peopleDetailsObject);

    }

    private void survivalPercentage(List<PeopleDetails> peopleDetailsObject) {
        Map<Integer,Integer> total = new HashMap<>();
        Map<Integer,Integer> count = new HashMap<>();
        Map<Integer ,Double> surivivalPercentage = new HashMap<>();


    }

    private void printNameAndOthers(List<PeopleDetails> peopleDetailsObject, int age) {
        for (PeopleDetails peopleDetails : peopleDetailsObject) {
            if (peopleDetails.getAge() < age){
                System.out.println("Name : " + peopleDetails.getName() + "\t Gender : " + peopleDetails.getGender() + "\t Age : "+peopleDetails.getAge());
            }
        }
    }

    private List<PeopleDetails> listCreation() {
        List<PeopleDetails> peopleObject = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/titanic.csv")))
        {
            String line ;
            while ((line = br.readLine()) != null)
            {
                String[] lineArray = line.split(",");

                if (lineArray[0].equalsIgnoreCase("Survived")){
                    continue;
                }

                int suriviveValue = Integer.parseInt(lineArray[0]);
                int pclass = Integer.parseInt(lineArray[1]);
                String name = lineArray[2];
                String gender = lineArray[3];
                float age = Float.parseFloat(lineArray[4]);
                boolean issurvive;

                if (suriviveValue == 0){
                    issurvive = false;
                }
                else {
                    issurvive = false;
                }
                PeopleDetails peopleDetails = new PeopleDetails(issurvive,pclass,name,age,gender);
                peopleObject.add(peopleDetails);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peopleObject;
    }

}

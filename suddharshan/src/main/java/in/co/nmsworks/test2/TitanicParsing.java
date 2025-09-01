package in.co.nmsworks.test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class TitanicParsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TitanicParsing tp = new TitanicParsing();
        List<Person> personList = tp.getPersonList("/home/nms-training/Downloads/titanic.csv");
        tp.getSurvivedPeopleAndPercentage(personList);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        tp.findLessAgePerson(personList,age);
    }
    public List<Person> getPersonList(String fileName){
        List<Person> personList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String rowData, data ="";
            br.readLine();
            while((rowData = br.readLine()) != null){
                data += rowData + "\n";
            }
            String rowDataList[] = data.split("\n");
            for (String s : rowDataList) {
                String dataVal[] = s.split(",");
                Person person = new Person(Integer.parseInt(dataVal[0]),Integer.parseInt(dataVal[1]),dataVal[2],dataVal[3],Float.valueOf(dataVal[4]));
                personList.add(person);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }
    public void getSurvivedPeopleAndPercentage(List <Person> personList){
        Map<Integer, List<Person>> personMap = new HashMap<>();
        int alive = 0;
        for (Person person : personList) {
            if(person.getSurvival() == 1){
                alive++;
            }
        }
        System.out.println("Alive People: " + alive);
        for (Person person : personList) {
            if(personMap.containsKey(person.getPClass())){
                List <Person> newList = personMap.get(person.getPClass());
                newList.add(person);
                personMap.replace(person.getPClass(),newList);
            }
            else{
                List <Person> list = new ArrayList<>();
                list.add(person);
                personMap.put(person.getPClass(),list);
            }
        }

        for (Map.Entry<Integer, List<Person>> integerListEntry : personMap.entrySet()) {
            int survival = 0;
            for (Person person : integerListEntry.getValue()) {
                if(person.getSurvival() == 1){
                    survival++;
                }
            }

            float percentage = (float) survival / integerListEntry.getValue().size();
            System.out.println(integerListEntry.getKey() + " Class survival percentage is: " + percentage);
        }
    }
    public void findLessAgePerson(List <Person> personList, int age){
        for (Person person : personList) {
            if(person.getAge() < age){
                System.out.println(person.getName() + " " + person.getAge() + " " + person.getSex());
            }
        }
    }
}

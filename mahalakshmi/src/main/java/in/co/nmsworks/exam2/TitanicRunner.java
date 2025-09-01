package in.co.nmsworks.exam2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TitanicRunner {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        TitanicRunner tr = new TitanicRunner();
        String fileName = "/home/nms-training/Downloads/titanic.csv";
        List<Titanic> titanicList = tr.getdataFromFile(fileName);
        for (Titanic titanic : titanicList) {
            System.out.println(titanic);
        }
        Map<Integer,Integer> survivalPercentage = tr.getClassWiseSurvivalCountAndPercentage(titanicList);
        int age = sc.nextInt();
        System.out.println(tr.printAge(titanicList,age));

    }

    public List<Titanic> getdataFromFile(String fileName) throws IOException {
        List<Titanic> titanicList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] strArr = line.split(",");
                System.out.println(strArr[0] + " " + strArr[1] + " " + strArr[4] + " " + strArr[2] + " " + strArr[3]);
                titanicList.add(new Titanic(Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1]),Float.parseFloat(strArr[4]),strArr[2].trim(),strArr[3].trim()));
            }
        }
        return titanicList;
    }

    public Map<Integer,Integer> getClassWiseSurvivalCountAndPercentage(List<Titanic> titanicList) {
        int totalCount = titanicList.size();
        Map<Integer,List<Integer>> survivalCount = new HashMap<>();
        Map<Integer,Integer> survivalPercentage = new HashMap<>();
        for (Titanic titanic : titanicList) {
            if(titanic.getSurvived() == 1) {
                survivalCount.putIfAbsent(titanic.getpClass(),new ArrayList<>());
            }
        }


        for (Map.Entry<Integer, List<Integer> entry : survivalCount.entrySet()) {
            int sum = 0, per = 0;
            List<Integer> integerList = entry.getValue();
            for (Integer i : integerList) {
                sum += i;
            }
            survivalPercentage.putIfAbsent(entry.getKey(),sum/totalCount * 100);
        }
        return survivalPercentage;
    }

    public List<Titanic> printAge(List<Titanic> titanicList, int age) {
        List<Titanic> titanics = new ArrayList<>();
        for (Titanic titanic : titanicList) {
            if(age <= titanic.getAge()) {
                titanics.add(titanic);
            }
        }
        return titanics;
    }
}

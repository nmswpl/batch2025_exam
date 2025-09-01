package in.co.nmsworks.exam2;

import java.io.*;
import java.util.*;

public class TitanicRunner
{
    public static void main(String[] args)
    {
        TitanicRunner tr = new TitanicRunner();
        String filename = "/home/nms-training/git/batch2025_exam/subash/src/main/resources/titanic.csv";
        List<Titanic> titanicList = tr.fileReader(filename);
//        System.out.println(titanicList);
        tr.surviePercentage(titanicList);
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        tr.searchByAge(titanicList,age);

    }

    private void searchByAge(List<Titanic> titanicList, int age)
    {

        for (Titanic titanic : titanicList)
        {
            if(titanic.getAge()<=age)
            {
                System.out.println(titanic.getName()+" "+titanic.getAge()+" "+titanic.getSex());
            }
        }

    }

    private void surviePercentage(List<Titanic> titanicList)
    {
        int count=0;
        Map<Integer, Double> totalCountMap = new HashMap<>();
        Map<Integer,Double> classWiseSurvivalCountMap = new HashMap<>();

        for (Titanic titanic : titanicList)
        {
            if(titanic.survived()==1 || titanic.survived()==0)
            {
                totalCountMap.put(titanic.getPcClass(),totalCountMap.getOrDefault(titanic.getPcClass(), Double.valueOf(0))+1);
            }
        }
        System.out.println(totalCountMap);

        for (Titanic titanic : titanicList)
        {
            if(titanic.survived()==1)
            {
                classWiseSurvivalCountMap.put(titanic.getPcClass(),classWiseSurvivalCountMap.getOrDefault(titanic.getPcClass(), Double.valueOf(0))+1);
            }
        }
        System.out.println(classWiseSurvivalCountMap);

    }


    private List<Titanic> fileReader(String filename)
    {
        List<Titanic> titanicList = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(filename))) {

            String line="";
            bf.readLine();

            while((line=bf.readLine())!=null)
            {
                String[] arr = line.split(",");
                titanicList.add(new Titanic(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[2],arr[3],Double.parseDouble(arr[4]),Boolean.parseBoolean(arr[5]),Boolean.parseBoolean(arr[6])));
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return titanicList;
    }
}

package in.co.nmsworks.test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PassengerRunner
{
    public static void main(String[] args)
    {
        PassengerRunner pr = new PassengerRunner();
        List<Passenger> passengerList = pr.fetchPassengerDetails("/home/nms-training/Downloads/titanic.csv");
        pr.printClassWiseSurviedPeople(passengerList);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        double age = sc.nextDouble();
        pr.printPassesengerDetailsBasedOnAge(passengerList, age);
    }

    private void printPassesengerDetailsBasedOnAge(List<Passenger> passengerList, double age)
    {
        for (Passenger p : passengerList)
        {
            if (p.getAge() == age)
            {
                System.out.println("Name : " + p.getName() + ", Age : " + p.getAge() + ", Gender : " + p.getGender());
            }
        }
    }

    private void printClassWiseSurviedPeople(List<Passenger> passengerList)
    {
        Map<Integer, List<Integer>> survivedPeople = new HashMap<>();

        for (Passenger p : passengerList)
        {
            if (survivedPeople.containsKey(p.getpClass()))
            {
                survivedPeople.get(p.getpClass()).add(p.getSurvived());
            }
            else
            {
                survivedPeople.put(p.getpClass(), new ArrayList<>());
                survivedPeople.get(p.getpClass()).add(p.getSurvived());
            }
        }

        int noOfSurvived = 0;
        for (Map.Entry<Integer, List<Integer>> survived : survivedPeople.entrySet())
        {
            for (Integer val : survived.getValue())
            {
                if (val == 1)
                {
                    noOfSurvived++;
                }
            }
            System.out.println(" Class : " + survived.getKey() + ", Survied People Count : " + noOfSurvived + ", Survival Percentage : " + ((double) noOfSurvived / survived.getValue().size()) * 100);
            noOfSurvived = 0;
        }
    }

    private List<Passenger> fetchPassengerDetails(String path)
    {
        List<Passenger> passengerList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            br.readLine();
            String line;
            while((line = br.readLine()) != null)
            {
                String[] data = line.replace("\"", "").split(",");
                Passenger passenger = new Passenger();
                passenger.setSurvived(Integer.parseInt(data[0].trim()));
                passenger.setpClass(Integer.parseInt(data[1].trim()));
                passenger.setName(data[2].trim());
                passenger.setGender(data[3].trim());
                passenger.setAge(Double.parseDouble(data[4].trim()));
                passenger.setSiblingOrSpouseAboard(Integer.parseInt(data[5].trim()));
                passenger.setParentsOrChilderAboard(Integer.parseInt(data[6].trim()));
                passenger.setFare(Double.parseDouble(data[7].trim()));
                passengerList.add(passenger);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return passengerList;
    }
}

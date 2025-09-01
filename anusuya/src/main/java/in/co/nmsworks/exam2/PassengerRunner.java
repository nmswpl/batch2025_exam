package in.co.nmsworks.exam2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PassengerRunner {

    public static void main(String[] args) {

        Passenger p = new Passenger();

        PassengerRunner pr = new PassengerRunner();

        pr.findSurvivalPercentageOfPassengers();

        pr.printPassengerNamesForGivenAge();
    }

    private void findSurvivalPercentageOfPassengers() {

        Map<Integer,Integer> survivedPassenger = new HashMap<>();
        Map<Integer,Integer> nonSurvivedPassenger = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/titanic.csv"))) {

            String line;
            br.readLine();
            while ((line = br.readLine()) != null){
                String[] splittedLine = line.split(",");

                int survival = Integer.parseInt(splittedLine[0]);
                int pclass = Integer.parseInt(splittedLine[1]);
                if (survival == 1){
                    survivedPassenger.put(pclass,survivedPassenger.getOrDefault(pclass,0)+1);
                }
                if (survival == 0){
                    nonSurvivedPassenger.put(pclass,nonSurvivedPassenger.getOrDefault(pclass,0)+1);
                }
            }

            for (Map.Entry<Integer, Integer> passenger : survivedPassenger.entrySet()) {
                int totalPeople = passenger.getValue() + nonSurvivedPassenger.get(passenger.getKey());
                float survivalPercentage = ((float) passenger.getValue() /totalPeople)*100;
                System.out.println(passenger.getKey() + " " + passenger.getValue() + " " + survivalPercentage);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void printPassengerNamesForGivenAge() {

        Map<String,Integer> namesWithAge = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/titanic.csv"))) {

            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] splittedLine = line.split(",");

                String name = splittedLine[2];
                int currentAge = Integer.parseInt(splittedLine[4].trim());
                namesWithAge.put(name,currentAge);
                System.out.println(namesWithAge);
            }
        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.println("Passengers having " + age + " years : \n");
        for (Map.Entry<String, Integer> passenger : namesWithAge.entrySet()) {
            if (passenger.getValue() == age){
                System.out.println(passenger.getKey());
            }
        }
    }
}

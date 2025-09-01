package in.co.nmsworks.test2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<Passengers> listOfPassengers = getAllPassengers();


        System.out.println(listOfPassengers.toString());
        percentageOfSurvivedpassengers(listOfPassengers);
        getPassengerDetails(listOfPassengers);


    }

    private static void percentageOfSurvivedpassengers(List<Passengers> listOfPassengers) {

        int survival1 = 0;
        int count1 = 0;
        for (Passengers p : listOfPassengers) {
            if (p.getPclass() == 1 && p.getSurvived() == 1) {
                survival1++;

            }
            if (p.getPclass() == 1) {
                count1++;
            }
        }
        double value1 = (survival1 / count1) / 100;
        System.out.println("Total Class 1: " + value1);
    }

    private static void getPassengerDetails(List<Passengers> listOfPassengers) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = ss.nextInt();

        for (Passengers value : listOfPassengers) {
            int passengerAge = value.getAge();
            if (passengerAge <= age) {
                System.out.println("Passenger Name : " + value.getName() + "|" + "Passenger Age :" + value.getAge() + "|" + "Passenger gender :" + value.getGender());
            }
        }
    }

    private static List<Passengers> getAllPassengers() {
        List<Passengers> listOfAllPassengers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/git/batch2025_exam/saranraj/src/main/java/in/co/nmsworks/test2/titanic.csv"))) {
            br.readLine();
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] passengers = line.split(",");
                int survived = Integer.parseInt(passengers[0].trim());
                int pclass = Integer.parseInt(passengers[1].trim());
                String name = passengers[2].trim();
                String gender = passengers[3].trim();
                int age = (int) Double.parseDouble(passengers[4].trim());
                Passengers p = new Passengers(survived, pclass, name, gender, age);
                listOfAllPassengers.add(p);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listOfAllPassengers;
    }
}

package in.co.nmsworks.javaexam2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePassingTitanic {
    public static void main(String[] args) {

        FilePassingTitanic filePassingTitanic = new FilePassingTitanic();

        filePassingTitanic.readFromTheFife("/home/nms-training/Downloads/titanic.csv");

        filePassingTitanic.inputAsAge("/home/nms-training/Downloads/titanic.csv");


    }

    private void inputAsAge(String fileName) {

        List<Titanic> titanicsList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {

                String[] strings = line.split(",");



                int survived = Integer.parseInt(strings[0]);
                int pClass = Integer.parseInt(strings[1]);
                String name = strings[2];
                String sex = strings[3];
                int age = Integer.parseInt(strings[4]);
                int paraent = Integer.parseInt(strings[5]);
                int fare = Integer.parseInt(strings[6]);


                Titanic titanic = new Titanic(survived,pClass,name,sex,age,paraent,fare);
                titanicsList.add(titanic);

            }
        } catch (Exception e) {

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age :::");
        int age = scanner.nextInt();

        for (Titanic t : titanicsList) {
            if(age >= t.age) {
                System.out.println(t.name + " " + t.sex + " " + t.age);
            }
        }




    }

    private void readFromTheFife(String fileName) {

        List<Titanic> titanicsList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {

                String[] strings = line.split(",");



                int survived = Integer.parseInt(strings[0]);
                int pClass = Integer.parseInt(strings[1]);
                String name = strings[2];
                String sex = strings[3];
                int age = Integer.parseInt(strings[4]);
                int paraent = Integer.parseInt(strings[5]);
                int fare = Integer.parseInt(strings[6]);


                Titanic titanic = new Titanic(survived,pClass,name,sex,age,paraent,fare);
                titanicsList.add(titanic);

            }
        } catch (Exception e) {

        }

        int class1 = 0;
        int class2 = 0;
        int class3 = 0;

        for (Titanic t : titanicsList) {

            if (t.pClass==1 && t.survived ==1) {
                class1++;
            }
            if (t.pClass==2 && t.survived == 1) {
                class2++;
            }
            if (t.pClass==3 && t.survived ==1) {
                class3++;
            }

        }


        System.out.println("Class 1 ::" + class1);
        System.out.println("Class 2 ::" + class2);
        System.out.println("Class 3 ::" + class3);



    }
}

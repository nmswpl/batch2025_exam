package in.co.nmsworks.exam2;

import java.io.BufferedReader;
import java.io.FileReader;

public class TitanicSurvivors {
    private int survived;
    private int pClasses;
    private String name;
    private String gender;
    private int age;
    private int siblingOrspouseAboarded;
    private int parentsOrchildrenAboarded;
    private double fare;

    public TitanicSurvivors() {

    }

    public int getSurvived() {
        return survived;
    }

    public int getpClasses() {
        return pClasses;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getSiblingOrspouseAboarded() {
        return siblingOrspouseAboarded;
    }

    public int getParentsOrchildrenAboarded() {
        return parentsOrchildrenAboarded;
    }

    public double getFare() {
        return fare;
    }

    public TitanicSurvivors(int survived, int pClasses, String name, String gender, int age, int siblingOrspouseAboarded, int parentsOrchildrenAboarded, double fare) {
        this.survived = survived;
        this.pClasses = pClasses;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.siblingOrspouseAboarded = siblingOrspouseAboarded;
        this.parentsOrchildrenAboarded = parentsOrchildrenAboarded;
        this.fare = fare;
    }
}

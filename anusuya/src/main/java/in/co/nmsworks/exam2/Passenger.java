package in.co.nmsworks.exam2;

import java.util.List;

public class Passenger {

    private int survived;
    private String pClass;
    private String name;
    private int age;
    private String sex;
    private int noOfSiblings;
    private int parentCount;
    private float fare;

    Passenger(){}

    public Passenger(int survived, String pClass, String name, int age, String sex, int noOfSiblings, int parentCount, float fare){
        this.survived = survived;
        this.pClass = pClass;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.noOfSiblings = noOfSiblings;
        this.parentCount = parentCount;
        this.fare = fare;
    }

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public String getpClass() {
        return pClass;
    }

    public void setpClass(String pClass) {
        this.pClass = pClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

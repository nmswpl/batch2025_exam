package in.co.nmsworks.test2;

public class Passenger
{
    /*Given a CSV File titanic.csv, Create Passenger Object.
    Print Class wise survived people Count and Survival percentage
    Survival % Formula : (No of people survived in class X / Total number of people in class X) *100.
    Get Input as Age from Console. Print the passenger name, age, gender where the passenger's age is less
    than or equal to the given age*/

    private int survived;
    private int pClass;
    private String name;
    private String gender;
    private double age;
    private int siblingOrSpouseAboard;
    private int parentsOrChilderAboard;
    private double fare;

    public Passenger()
    {}

    public Passenger(int survived, int pClass, String name, String gender, double age, int siblingOrSpouseAboard, int parentsOrChilderAboard, double fare)
    {
        this.survived = survived;
        this.pClass = pClass;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.siblingOrSpouseAboard = siblingOrSpouseAboard;
        this.parentsOrChilderAboard = parentsOrChilderAboard;
        this.fare = fare;
    }

    public int getSurvived()
    {
        return survived;
    }

    public void setSurvived(int survived)
    {
        this.survived = survived;
    }

    public int getpClass()
    {
        return pClass;
    }

    public void setpClass(int pClass)
    {
        this.pClass = pClass;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public double getAge()
    {
        return age;
    }

    public void setAge(double age)
    {
        this.age = age;
    }

    public int getSiblingOrSpouseAboard()
    {
        return siblingOrSpouseAboard;
    }

    public void setSiblingOrSpouseAboard(int siblingOrSpouseAboard)
    {
        this.siblingOrSpouseAboard = siblingOrSpouseAboard;
    }

    public int getParentsOrChilderAboard()
    {
        return parentsOrChilderAboard;
    }

    public void setParentsOrChilderAboard(int parentsOrChilderAboard)
    {
        this.parentsOrChilderAboard = parentsOrChilderAboard;
    }

    public double getFare()
    {
        return fare;
    }

    public void setFare(double fare)
    {
        this.fare = fare;
    }

}

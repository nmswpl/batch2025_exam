package in.co.nmsworks.exam2;

public class Passanger
{
    int survived;
    int pcClass;
    String name;
    String sex;
    int age;
    int sibilingSpouse;
    int parentChildrenc;
    float fare;

    public Passanger(int survived, int pcClass, String name, String sex, int age, int sibilingSpouse, int parentChildrenc, float fare) {
        this.survived = survived;
        this.pcClass = pcClass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sibilingSpouse = sibilingSpouse;
        this.parentChildrenc = parentChildrenc;
        this.fare = fare;
    }

    public int getSurvived() {
        return survived;
    }

    public int getpcClass() {
        return pcClass;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getSibilingSpouse() {
        return sibilingSpouse;
    }

    public int getParentChildrenc() {
        return parentChildrenc;
    }

    public float getFare() {
        return fare;
    }


}

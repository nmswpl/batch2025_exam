package in.co.nmsworks.javaexam2;

public class Titanic {
    int survived;
    int pClass;
    String name;
    String sex;
    int age;
    int paraent;
    int fare;

    public Titanic() {

    }
    public Titanic(int survived, int pClass, String name, String sex, int age, int paraent, int fare) {
        this.survived = survived;
        this.pClass = pClass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.paraent = paraent;
        this.fare = fare;
    }

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public int getpClass() {
        return pClass;
    }

    public void setpClass(int pClass) {
        this.pClass = pClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getParaent() {
        return paraent;
    }

    public void setParaent(int paraent) {
        this.paraent = paraent;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}

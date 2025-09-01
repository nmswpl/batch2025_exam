package in.co.nmsworks.Exam2;

public class SurvivedPerson {
   int survived;
   int pcClass;
   String name;
   String sex;
   int age;
   int siblingsABoard;
   int parentsAboard;
   double fare;

    public SurvivedPerson(int survived, int pcClass, String name, String sex, int age, int siblingsABoard, int parentsAboard, double fare) {
        this.survived = survived;
        this.pcClass = pcClass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.siblingsABoard = siblingsABoard;
        this.parentsAboard = parentsAboard;
        this.fare = fare;
    }

    public SurvivedPerson() {
    }

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public int getParentsAboard() {
        return parentsAboard;
    }

    public void setParentsAboard(int parentsAboard) {
        this.parentsAboard = parentsAboard;
    }

    public int getSiblingsABoard() {
        return siblingsABoard;
    }

    public void setSiblingsABoard(int siblingsABoard) {
        this.siblingsABoard = siblingsABoard;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPcClass() {
        return pcClass;
    }

    public void setPcClass(int pcClass) {
        this.pcClass = pcClass;
    }
}

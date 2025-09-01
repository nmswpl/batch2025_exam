package in.co.nmsworks.exam2;
//Survived,Pclass,Name,Sex,Age,Siblings/Spouses Aboard,Parents/Children Aboard,Fare
public class Passenger {
    private int survived ;
    private int Pclass ;
    private String name ;
    private String gender ;
    private  int age ;
    private  int siblingsSpouses ;
    private int parentsChildren ;
    private float fare ;

    public Passenger(int survived, int pclass, String name, String gender, int age, int siblingsSpouses, int parentsChildren, float fare) {
        this.survived = survived;
        Pclass = pclass;
        this.name = name;
        this.gender= gender;
        this.age = age;
        this.siblingsSpouses = siblingsSpouses;
        this.parentsChildren = parentsChildren;
        this.fare = fare;
    }

    public Passenger(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.gender= sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String sex) {
        this.gender= sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPclass() {
        return Pclass;
    }

    public void setPclass(int pclass) {
        Pclass = pclass;
    }

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public int getSiblingsSpouses() {
        return siblingsSpouses;
    }

    public void setSiblingsSpouses(int siblingsSpouses) {
        this.siblingsSpouses = siblingsSpouses;
    }

    public int getParentsChildren() {
        return parentsChildren;
    }

    public void setParentsChildren(int parentsChildren) {
        this.parentsChildren = parentsChildren;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

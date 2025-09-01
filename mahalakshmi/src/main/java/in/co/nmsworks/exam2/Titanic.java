package in.co.nmsworks.exam2;

public class Titanic {
    private int survived;
    private int pClass;
    private float age;
    private String name;
    private String gender;

    public Titanic(int survived, int pClass, float age, String name, String gender) {
        this.survived = survived;
        this.pClass = pClass;
        this.age = age;
        this.name = name;
        this.gender = gender;
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

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Titanic{" +
                "survived=" + survived +
                ", pClass=" + pClass +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

package in.co.nmsworks.test2;

public class Person {
    private int survival;
    private int PClass;
    private String name;
    private String sex;
    private float age;

    public Person(int survival, int PClass, String name, String sex, float age) {
        this.survival = survival;
        this.PClass = PClass;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getSurvival() {
        return survival;
    }

    public void setSurvival(int survival) {
        this.survival = survival;
    }

    public int getPClass() {
        return PClass;
    }

    public void setPClass(int PClass) {
        this.PClass = PClass;
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

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "survival=" + survival +
                ", PClass=" + PClass +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}

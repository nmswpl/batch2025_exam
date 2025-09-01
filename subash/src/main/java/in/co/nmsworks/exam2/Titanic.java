package in.co.nmsworks.exam2;

public class Titanic
{
//    Survived,Pclass,Name,Sex,Age,Siblings/Spouses Aboard,Parents/Children Aboard,Fare
    private int survived;
    private int pcClass;
    private String name;
    private String sex;
    private double age;
    private boolean siblings;
    private boolean child;
    private double fare;

    public Titanic(int survived, int pcClass, String name, String sex, double age, boolean siblings, boolean child) {
        this.survived = survived;
        this.pcClass = pcClass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.siblings = siblings;
        this.child = child;
    }

    public int survived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public int getPcClass() {
        return pcClass;
    }

    public void setPcClass(int pcClass) {
        this.pcClass = pcClass;
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

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isSiblings() {
        return siblings;
    }

    public void setSiblings(boolean siblings) {
        this.siblings = siblings;
    }

    public boolean isChild() {
        return child;
    }

    public void setChild(boolean child) {
        this.child = child;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Titanic{" +
                "survived=" + survived +
                ", pcClass=" + pcClass +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", siblings=" + siblings +
                ", child=" + child +
                ", fare=" + fare +
                '}';
    }
}

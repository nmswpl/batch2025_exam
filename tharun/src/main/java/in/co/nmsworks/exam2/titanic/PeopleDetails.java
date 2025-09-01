package in.co.nmsworks.exam2.titanic;

public class PeopleDetails {
    private boolean isSurvived;
    private int pclass;
    private String name;
    private int age;
    private String gender;

    public PeopleDetails(boolean isSurvived, int pclass, String name, float age, String gender) {
        this.isSurvived = isSurvived;
        this.pclass = pclass;
        this.name = name;
        this.age = (int) age;
        this.gender = gender;
    }

    public boolean isSurvived() {
        return isSurvived;
    }

    public void setSurvived(boolean survived) {
        isSurvived = survived;
    }

    public int getPclass() {
        return pclass;
    }

    public void setPclass(int pclass) {
        this.pclass = pclass;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PeopleDetails{" +
                "isSurvived=" + isSurvived +
                ", pclass=" + pclass +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

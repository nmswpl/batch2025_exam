package in.co.nmsworks.exam2;

public class Survied
{
   // Survived,Pclass,Name,Sex,Age,Siblings/Spouses Aboard,Parents/Children Aboard,Fare

    private  int survived;

    public Survied(int survived) {
        this.survived = survived;
    }

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    @Override
    public String toString() {
        return "Survied{" +
                "survived=" + survived +
                '}';
    }
}

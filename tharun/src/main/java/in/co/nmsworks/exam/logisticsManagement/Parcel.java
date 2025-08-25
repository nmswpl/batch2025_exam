package in.co.nmsworks.exam.logisticsManagement;

public class Parcel {
    private int weight;
    private int distance;

    public Parcel(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", distance=" + distance +
                '}';
    }
}

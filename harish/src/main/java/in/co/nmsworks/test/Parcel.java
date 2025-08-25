package in.co.nmsworks.test;

public class Parcel {
    public Parcel(){

    }
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int weight;
        int distance;

    public Parcel(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }
}

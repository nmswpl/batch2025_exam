package in.co.nmsworks.test;

public class Parcel {

    private double weight;
    private double distance;

    Parcel(){}

    public Parcel(double weight, double distance){
        this.weight = weight;
        this.distance = distance;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", distance=" + distance +
                '}';
    }
}

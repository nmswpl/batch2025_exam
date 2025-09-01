package in.co.nmsworks.training_exam_2025;

public class Parcel
{
    double weight;
    double distance;

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", distance=" + distance +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    public Parcel(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }
}

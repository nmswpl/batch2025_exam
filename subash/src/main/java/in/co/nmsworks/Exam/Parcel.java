package in.co.nmsworks.Exam;

import java.util.Arrays;

public class Parcel
{
    private int weight;
    private int distance;
    private int[] latLongTo;


    public int[] getLatLongTo() {
        return latLongTo;
    }

    public void setLatLongTo(int[] latLongTo) {
        this.latLongTo = latLongTo;
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

    public Parcel(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", distance=" + distance +
                ", latLongTo=" + Arrays.toString(latLongTo) +
                '}';
    }
}

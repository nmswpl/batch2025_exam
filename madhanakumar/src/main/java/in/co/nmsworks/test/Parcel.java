package in.co.nmsworks.test;

import java.util.Arrays;

public class Parcel {
    private double weight;
    private String distance;
    private int[] latLongTo;

    public int[] getLatLongTo() {
        return latLongTo;
    }

    public void setLatLongTo(int[] latLongTo) {
        this.latLongTo = latLongTo;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Parcel(double weight, String distance) {
        this.weight = weight;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "distance='" + distance + '\'' +
                ", weight=" + weight +
                ", latLongTo=" + Arrays.toString(latLongTo) +
                '}';
    }
}

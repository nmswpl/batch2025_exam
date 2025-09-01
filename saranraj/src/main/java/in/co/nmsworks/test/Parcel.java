package in.co.nmsworks.test;

import java.util.Arrays;

public class Parcel {
    private double weight;
    private double distance;
    private int[] latLong;

    public int[] getLatLong() {
        return latLong;
    }

    public void setLatLong(int[] latLong) {
        this.latLong = latLong;
    }

    public Parcel(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", distance=" + distance +
                ", latLong=" + Arrays.toString(latLong) +
                '}';
    }
}

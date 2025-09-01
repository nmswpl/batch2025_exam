package in.co.nmsworks.exam.logisticsmanagement;

import java.util.Arrays;

public class Parcel {
    private double weight;
    private double distance;
    private int[] toLatLong;

    public int[] getToLatLong() {
        return toLatLong;
    }

    public void setToLatLong(int[] tolatLong) {
        toLatLong = tolatLong;
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
                ", toLatLong=" + Arrays.toString(toLatLong) +
                '}';
    }
}

package in.co.nmsworks.JavaTraining.LogisticsManagement;

import java.util.Arrays;

public class Parcel {
    int weight;
    int distance;
    private int[] latLongTo;

    public int[] getLatLongTo() {
        return latLongTo;
    }

    public void setLatLongTo(int[] latLongTo) {
        this.latLongTo = latLongTo;
    }

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
                ", latLongTo=" + Arrays.toString(latLongTo) +
                '}';
    }
}

package in.co.nmsworks;

import java.util.Arrays;

public class Parcel {
    int weight;
    int distance;
    private int[] toLatLong = new int[2];

    public Parcel() {

    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance)
    {
        this.distance = distance;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int[] getToLatLong() {
        return toLatLong;
    }

    public void setToLatLong(int[] toLatLong) {
        this.toLatLong = toLatLong;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", distance=" + distance +
                ", toLatLong=" + Arrays.toString(toLatLong) +
                '}';
    }

    public Parcel(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }
}


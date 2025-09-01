package in.co.nmsworks.Test;

import java.util.Arrays;

public class Parcel {
    double weight;
    double distance;
    private int[] latLongTo;

    public int[] getLatLongTo() {
        return latLongTo;
    }

    public void setLatLongTo(int[] latLongTo) {
        this.latLongTo = latLongTo;
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
                ", latLongTo=" + Arrays.toString(latLongTo) +
                '}';
    }
}

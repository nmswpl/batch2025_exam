package in.co.nmsworks;

import java.util.Arrays;

public class Parcel {
    private int weight;
    private double distance;
    private int[] latLonto;


    public Parcel(int weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public int[] getLatLonto() {
        return latLonto;
    }

    public void setLatLonto(int[] latLonto) {
        this.latLonto = latLonto;
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", distance=" + distance +
                ", latLonto=" + Arrays.toString(latLonto) +
                '}';
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}

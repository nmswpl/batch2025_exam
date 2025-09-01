package in.co.nmsworks.test;

import java.util.Arrays;

public class Parcel {

    private double weight;
    private double distance;
    private double totalCost;
    private int[] latLongTo = new int[2];

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

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int[] getLatLongTo() {
        return latLongTo;
    }

    public void setLatLongTo(int[] latLongTo) {
        this.latLongTo = latLongTo;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", distance=" + distance +
                ", totalCost=" + totalCost +
                ", latLongTo=" + Arrays.toString(latLongTo) +
                '}';
    }
}

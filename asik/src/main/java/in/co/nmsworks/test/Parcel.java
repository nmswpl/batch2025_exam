package in.co.nmsworks.test;

import java.util.Arrays;

public class Parcel
{
    private double weight;
    private double distance;
    private int[] latLongTo;

    public Parcel(double weight, double distance)
    {
        this.weight = weight;
        this.distance = distance;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getDistance()
    {
        return distance;
    }

    public int[] getLatLongTo()
    {
        return latLongTo;
    }

    public void setLatLongTo(int[] latLongTo)
    {
        this.latLongTo = latLongTo;
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

package in.co.nmsworks.javaexam;
import com.google.gson.Gson;

import java.util.Arrays;


public class Parcel {
    double weight;
    double distance;
    private int[] LatLonto;

    public Parcel(double weight, double distance, int[] latLonto) {
        this.weight = weight;
        this.distance = distance;
        LatLonto = latLonto;
    }

    public int[] getLatLonto() {
        return LatLonto;
    }

    public void setLatLonto(int[] latLonto) {
        LatLonto = latLonto;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", distance=" + distance +
                ", LatLonto=" + Arrays.toString(LatLonto) +
                '}';
    }
}

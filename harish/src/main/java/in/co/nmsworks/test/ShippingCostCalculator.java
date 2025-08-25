package in.co.nmsworks.test;

import java.util.HashSet;
import java.util.Set;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(200, 455);
        ShippingMethod sm = new Airshipping();
        double totalCost = calculateTotalCost(sm, parcel);
        double  quatt = generateQuatation(parcel);
    }



    private static double calculateTotalCost(ShippingMethod sm, Parcel parcel) {
       if (sm.getClass().equals("AirShipping")){
           double weight = parcel.getWeight();
           double distance = parcel.getDistance();
           double totalCost;
           if (weight > sm.getBaseWeight()) {
               weight = weight - sm.getBaseWeight();
               totalCost = sm.getPrice() + sm.additionalWeightCost(weight);
           } else {
               totalCost = sm.getPrice();
           }
           if (distance > sm.getBaseDistance()) {
               distance = distance - sm.getBaseDistance();
               totalCost = totalCost + sm.additionalDistanceCost(distance);
           }
           totalCost = totalCost * 2.5;
           return totalCost;
       }
       else{
           double weight = parcel.getWeight();
           double distance = parcel.getDistance();
           double totalCost;
           if (weight > sm.getBaseWeight()) {
               weight = weight - sm.getBaseWeight();
               totalCost = sm.getPrice() + sm.additionalWeightCost(weight);
           } else {
               totalCost = sm.getPrice();
           }
           if (distance > sm.getBaseDistance()) {
               distance = distance - sm.getBaseDistance();
               totalCost = totalCost + sm.additionalDistanceCost(distance);
           }
           return totalCost;
       }
    }
    private static double generateQuatation(Parcel parcel) {
        ShippingMethod sm = new Airshipping();
        double weight = parcel.getWeight();
        double distance = parcel.getDistance();
        double totalCost;
        if (weight > sm.getBaseWeight()) {
            weight = weight - sm.getBaseWeight();
            totalCost = sm.getPrice() + sm.additionalWeightCost(weight);
        } else {
            totalCost = sm.getPrice();
        }
        if (distance > sm.getBaseDistance()) {
            distance = distance - sm.getBaseDistance();
            totalCost = totalCost + sm.additionalDistanceCost(distance);
        }
        totalCost = totalCost * 2.5;
        return totalCost;
    }
}



package in.co.nmsworks.test;

import java.util.HashSet;
import java.util.Set;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(200, 455);
        ShippingMethod sm = new Airshipping();
        double totalCost = calculateTotalCost(sm, parcel);
        System.out.println(totalCost);
        generateQuatation(parcel);
    }



    private static double calculateTotalCost(ShippingMethod sm, Parcel parcel) {

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

        if (sm instanceof Airshipping)
            totalCost = totalCost * 2.5;

        return totalCost;
       /*if (sm.getClass().equals("AirShipping")){
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
       }*/
    }

    private static void  generateQuatation(Parcel parcel) {
        Airshipping as = new Airshipping();
        SeaShipping ss = new SeaShipping();
        LandShipping ls = new LandShipping();

        System.out.println("AS Cost = " + calculateTotalCost(as, parcel));
        System.out.println("LS Cost = " + calculateTotalCost(ls, parcel));
        System.out.println("SS Cost = " + calculateTotalCost(ss, parcel));
    }
}



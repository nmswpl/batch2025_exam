package in.co.nmsworks.javaexam;

import java.util.Scanner;

public class ShippingCostCalculator {

    public static void main(String[] args) {

        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Weight ::" + " ");
        double weigth = sc.nextDouble();
        System.out.println("Distance :: " + " ");
        double distance = sc.nextDouble();

        Parcel parcel = new Parcel(weigth,distance);

        shippingCostCalculator.calculateTotalCost(parcel);

    }





    void calculateTotalCost(Parcel parcel) {
        AirShipping airShipping = new AirShipping();

        System.out.println("Cost in Air Shipping :: " + (airShipping.additionalWeightCost(parcel.weight) + airShipping.additionalWeightCost(parcel.distance)));


        LandShipping landShipping = new LandShipping();
        System.out.println("Cost of Land Shipping :: " + (landShipping.additionalWeightCost(parcel.weight) + landShipping.additionalDistanceCost(parcel.distance)));

        SeaShipping seaShipping = new SeaShipping();
        System.out.println("Cost of Sea Shipping :: " + (seaShipping.additionalWeightCost(parcel.weight) + seaShipping.additionalDistanceCost(parcel.distance)));

    }

    void generateQuotation(Parcel parcel) {

    }
}

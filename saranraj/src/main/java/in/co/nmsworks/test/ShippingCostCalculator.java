package in.co.nmsworks.test;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        ShippingCostCalculator sc = new ShippingCostCalculator();
        Parcel parcel = new Parcel(15, 1200);
        AirShipping air = new AirShipping();
        sc.calculateTotalCost(air, parcel);
        SeaShipping sea = new SeaShipping();
        sc.calculateTotalCost(sea, parcel);
        LandShipping land = new LandShipping();
        sc.calculateTotalCost(land, parcel);

    }


    private void calculateTotalCost(ShippingMethod method, Parcel parcel) {
        double distance = method.additionalDistanceCost(parcel.getDistance());
        double weight = method.additionalWeightCost(parcel.getWeight());
        System.out.println("Method :" + method.getClass().getSimpleName());
        System.out.println("Calculate distance :" + distance);
        System.out.println("Calculate weight :" + weight);

    }
}

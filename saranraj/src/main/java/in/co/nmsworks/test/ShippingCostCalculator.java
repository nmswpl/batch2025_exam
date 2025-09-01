package in.co.nmsworks.test;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        ShippingCostCalculator sc = new ShippingCostCalculator();
        Parcel parcel = new Parcel(15, 1200);

        sc.generateQuotation(parcel);
    }

    private void generateQuotation(Parcel parcel) {
        AirShipping air = new AirShipping();
        SeaShipping sea = new SeaShipping();
        LandShipping land = new LandShipping();
        System.out.println("Air Shipping : " + calculateTotalCost(air, parcel));
        System.out.println("Land Shipping : " + calculateTotalCost(land, parcel));
        System.out.println("Sea Shipping : " + calculateTotalCost(sea, parcel));

    }


    private static double calculateTotalCost(ShippingMethod method, Parcel parcel) {
        double base = method.getBaseDistance();
        double distance = method.additionalDistanceCost(parcel.getDistance());
        double weight = method.additionalWeightCost(parcel.getWeight());

        double total = distance + weight + base;

        if (method instanceof AirShipping) {
            total += total * 0.25;
        }
        return total;
    }
}

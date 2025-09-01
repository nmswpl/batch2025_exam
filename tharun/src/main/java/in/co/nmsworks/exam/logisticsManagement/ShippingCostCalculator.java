package in.co.nmsworks.exam.logisticsManagement;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();

        Parcel parcel = new Parcel(5,1000);
        shippingCostCalculator.generateQuotation(parcel);
    }

    public double calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel){
        double distanceCost = shippingMethod.additionalDistanceCost(parcel.getDistance());
        double weightCost = shippingMethod.additionalWeightCost(parcel.getWeight());
        if (shippingMethod instanceof  AirShipping){
            distanceCost += (distanceCost * 0.25);
        }
        return distanceCost + weightCost;
    }
    public void generateQuotation(Parcel parcel){


        ShippingMethod airShipping = new AirShipping(10, 50,500);
        System.out.println("Cost of Air Shipping : " + calculateTotalCost(airShipping,parcel));

        ShippingMethod landShipping = new LandShipping(10, 50,500);
        System.out.println("Cost of Land Shipping : " + calculateTotalCost(landShipping,parcel));

        ShippingMethod seaShipping = new SeaShipping(10, 50,500);
        System.out.println("Cost of Air Shipping : " + calculateTotalCost(seaShipping,parcel));

    }
}

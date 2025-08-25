package in.co.nmsworks.test;

// ShippingCostCalculator.java
public class ShippingCostCalculator {

    public double calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel) {

        double basePrice = shippingMethod.getBasePrice();
        double weightCost = shippingMethod.additionalWeightCost(parcel.getWeight());
        double distanceCost = shippingMethod.additionalDistanceCost(parcel.getDistance());

        double total = basePrice + weightCost + distanceCost;
        return total;
    }

    public void generateQuotation(Parcel parcel) {
        ShippingMethod air = new AirShipping();
        ShippingMethod land = new LandShipping();
        ShippingMethod sea = new SeaShipping();

        double airCost = calculateTotalCost(air, parcel);
        double landCost = calculateTotalCost(land, parcel);
        double seaCost = calculateTotalCost(sea, parcel);

        System.out.println("Quotation for Parcel"+ parcel.getWeight() + parcel.getDistance());
        System.out.println("Air Shipping"+airCost);
        System.out.println("Land Shipping"+landCost);
        System.out.println("Sea Shipping"+seaCost);
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel(15, 1200);
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        calculator.generateQuotation(parcel);
    }
}


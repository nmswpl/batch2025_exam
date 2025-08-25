package in.co.nmsworks.exam.logisticsmanagement;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        ShippingCostCalculator scc = new ShippingCostCalculator();
        Parcel parcel = new Parcel(15,1200);
        scc.generateQuotation(parcel);

    }

    public double calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel) {
        double totalShippingCost = shippingMethod.getBasePrice()+shippingMethod.additionalWeightCost(parcel.getWeight())+shippingMethod.additionalDistanceCost(parcel.getDistance());
        if(shippingMethod instanceof AirShipping) {
            totalShippingCost += (2.5 * shippingMethod.getBasePrice());
        }
        return totalShippingCost;
    }

    public void generateQuotation(Parcel parcel) {
        ShippingMethod air = new AirShipping();
        ShippingMethod land = new LandShipping();
        ShippingMethod sea = new SeaShipping();
        parcel.setDistance(1200);
        parcel.setWeight(15);
        calculateTotalCost(air,parcel);
        calculateTotalCost(land,parcel);
        calculateTotalCost(sea,parcel);
    }
}

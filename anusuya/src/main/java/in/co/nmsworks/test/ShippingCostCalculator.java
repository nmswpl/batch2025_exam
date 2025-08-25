package in.co.nmsworks.test;

public class ShippingCostCalculator {

    public static void main(String[] args) {

        ShippingCostCalculator scc = new ShippingCostCalculator();

        Parcel parcel = new Parcel();

        AirShipping air = new AirShipping(10.0);
        scc.calculateTotalCost(air,parcel);
        scc.generateQuotation(parcel);

        LandShipping land = new LandShipping(20.0);

        SeaShipping sea = new SeaShipping(30);

    }

    private void calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel){

    }

    private void generateQuotation(Parcel parcel) {
    }
}

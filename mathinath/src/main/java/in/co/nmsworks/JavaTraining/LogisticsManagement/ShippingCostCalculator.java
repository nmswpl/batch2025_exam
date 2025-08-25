package in.co.nmsworks.JavaTraining.LogisticsManagement;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        ShippingMethod as = new AirShipping();
        ShippingMethod ls = new LandShipping();
        ShippingMethod ss = new SeaShipping();
        Parcel p = new Parcel();
        calculateTotalCost(as,p);
        generateQuotation(p);
    }

    private static void generateQuotation(Parcel p) {

    }

    private static void calculateTotalCost(ShippingMethod as, Parcel p) {

    }


}

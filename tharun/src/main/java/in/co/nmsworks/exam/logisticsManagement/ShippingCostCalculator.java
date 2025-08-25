package in.co.nmsworks.exam.logisticsManagement;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();


        Parcel parcel = new Parcel(5,100);

        ShippingMethod airShipping = new AirShipping();
        shippingCostCalculator.calculateTotalCost(airShipping,parcel);

        ShippingMethod landShipping = new LandShipping();
        shippingCostCalculator.calculateTotalCost(landShipping,parcel);

        ShippingMethod seaShipping = new SeaShipping();
        shippingCostCalculator.calculateTotalCost(seaShipping,parcel);



    }

    public void calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel){
        generateQuotation(parcel);
    }
    public void generateQuotation(Parcel parcel){

    }
}

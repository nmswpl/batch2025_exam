package in.co.nmsworks.exam.logisticsManagement;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();

        ShippingMethod airShipping = new AirShipping();

        Parcel parcel = new Parcel(5,100);

        shippingCostCalculator.calculateTotalCost(airShipping,parcel);


        shippingCostCalculator.generateQuotation(parcel);
    }

    public void calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel){

    }
    public void generateQuotation(Parcel parcel){

    }
}

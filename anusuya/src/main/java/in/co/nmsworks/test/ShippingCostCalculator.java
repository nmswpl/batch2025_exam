package in.co.nmsworks.test;

public class ShippingCostCalculator {

    public static void main(String[] args) {

        ShippingCostCalculator scc = new ShippingCostCalculator();

        Parcel parcel = new Parcel();
        parcel.setWeight(15);
        parcel.setDistance(1200);

        AirShipping air = new AirShipping(1.0);
        scc.calculateTotalCost(air,parcel);

        LandShipping land = new LandShipping(1.0);
        scc.calculateTotalCost(land,parcel);

        SeaShipping sea = new SeaShipping(1.0);
        scc.calculateTotalCost(sea,parcel);

    }

    private void calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel){

        double shippingCost = 0;

        if (shippingMethod instanceof SeaShipping){
            shippingCost = (shippingMethod.getBasePrice()+shippingMethod.additionalDistanceCost(parcel.getDistance())
                    +shippingMethod.additionalWeightCost(parcel.getWeight()))+(2.5/100);
            parcel.setTotalCost(shippingCost);
            System.out.print("Sea Shipping = ");
            generateQuotation(parcel);
        }
        else{
            shippingCost = shippingMethod.getBasePrice()+shippingMethod.additionalDistanceCost(parcel.getDistance())
                    +shippingMethod.additionalWeightCost(parcel.getWeight());
            parcel.setTotalCost(shippingCost);
            if (shippingMethod instanceof LandShipping){
                System.out.print("Land Shipping = ");
                generateQuotation(parcel);
            }
            else{
                System.out.print("Air Shipping = ");
                generateQuotation(parcel);
            }
        }
    }

    private void generateQuotation(Parcel parcel) {
        System.out.println("Quotation for parcel : Weight (" + parcel.getWeight() + ") and Distance (" + parcel.getDistance() + "):");
        System.out.print(parcel.getTotalCost() + "\n");
    }
}

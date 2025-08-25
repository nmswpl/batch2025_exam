package in.co.nmsworks.test;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        ShippingCostCalculator sc = new ShippingCostCalculator();
        Parcel p = new Parcel(35,500);
        sc.generateQuotation(p);
    }
    public void calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel){
        double distance = parcel.getDistance();
        double weight = parcel.getWeight();
        double totalcost = shippingMethod.additionalDistanceCost(distance) + shippingMethod.additionalWeightCost(weight);
        System.out.println(totalcost);
    }
    public void generateQuotation(Parcel parcel){
        LandShipping ls = new LandShipping();
        AirShipping as = new AirShipping();
        SeaShipping ss = new SeaShipping();
        System.out.println("Land price: " );
        calculateTotalCost(ls,parcel);
        System.out.println("Air price: " );
        calculateTotalCost(as,parcel);
        System.out.println("Sea price: " );
        calculateTotalCost(ss,parcel);
    }
}

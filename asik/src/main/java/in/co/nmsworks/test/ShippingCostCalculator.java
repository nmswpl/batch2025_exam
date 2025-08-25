package in.co.nmsworks.test;

public class ShippingCostCalculator
{

    public static void main(String[] args)
    {
        AirShipping airShipping = new AirShipping(500, 30, 300);
        SeaShipping seaShipping = new SeaShipping(250, 25, 150);
        LandShipping landShipping = new LandShipping(200, 15, 150);

        Parcel parcel1 = new Parcel(28, 350);
        Parcel parcel2 = new Parcel(40, 700);
        Parcel parcel3 = new Parcel(15, 100);

        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();
        double cost = shippingCostCalculator.calculateTotalCost(airShipping, parcel1);
        System.out.println("The Air Shipping Cost for Parcel is " + cost);
    }

    public double calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel)
    {
            if (shippingMethod instanceof AirShipping)
            {
                return ((2.5) * shippingMethod.getBasePrice() + shippingMethod.additionalWeightCost(parcel.getWeight()) * shippingMethod.additionalDistanceCost(parcel.getDistance())) + shippingMethod.getBasePrice() + shippingMethod.additionalWeightCost(parcel.getWeight()) * shippingMethod.additionalDistanceCost(parcel.getDistance());
            }
            return shippingMethod.getBasePrice() + shippingMethod.additionalWeightCost(parcel.getWeight()) * shippingMethod.additionalDistanceCost(parcel.getDistance());
    }

    public void generateQuotation(Parcel parcel)
    {
        System.out.println("Quotation for Parcel (Weight: " + parcel.getWeight() + " kg, Distance: " + parcel.getDistance() + " km :");
    }
}

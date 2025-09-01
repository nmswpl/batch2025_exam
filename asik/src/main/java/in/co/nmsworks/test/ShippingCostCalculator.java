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

        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();
        double cost = shippingCostCalculator.calculateTotalCost(airShipping, parcel1);
        System.out.println("The Air Shipping Cost for Parcel is " + cost);

        shippingCostCalculator.generateQuotation(parcel2);
    }

    public double calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel)
    {
        double totalCost = shippingMethod.getBasePrice();
        if (parcel.getWeight() > shippingMethod.getBaseWeight())
        {
            totalCost += shippingMethod.additionalWeightCost(parcel.getWeight() - shippingMethod.getBaseWeight());
        }
        if (parcel.getDistance() > shippingMethod.getBaseDistance())
        {
            totalCost += shippingMethod.additionalDistanceCost(parcel.getDistance() - shippingMethod.getBaseDistance());
        }
        if (shippingMethod instanceof AirShipping)
        {
            double surgeAmount = 2.5 * totalCost;
            return surgeAmount + totalCost;
        }
        return totalCost;
    }

    public void generateQuotation(Parcel parcel)
    {
        System.out.println("Quotation for Parcel (Weight: " + parcel.getWeight() + " kg, Distance: " + parcel.getDistance() + " km) :");
        System.out.println("AirShipping : " + (calculateTotalCost(new AirShipping(500, 30, 300), parcel)));
        System.out.println("SeaShipping : " + (calculateTotalCost(new SeaShipping(250, 25, 150), parcel)));
        System.out.println("LandShipping : " + (calculateTotalCost(new LandShipping(200, 15, 150), parcel)));
    }
}

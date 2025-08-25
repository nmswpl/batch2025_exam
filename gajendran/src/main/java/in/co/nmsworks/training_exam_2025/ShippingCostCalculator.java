package in.co.nmsworks.training_exam_2025;

public class ShippingCostCalculator
{
    public double calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel)
    {
        return 0;
    }

    public void generateQuotation(Parcel parcel)
    {
        ShippingMethod air = new AirShipping();
        System.out.println("Air Shipping: "+air.additionalDistanceCost(parcel.getDistance())+air.additionalWeightCost(parcel.getWeight()));
        ShippingMethod alandir = new LandShipping();
        System.out.println("Air Shipping: "+alandir.additionalDistanceCost(parcel.getDistance())+long.additionalWeightCost(parcel.getWeight()));
        ShippingMethod sea = new SeaShipping();
        System.out.println("Air Shipping: "+sea.additionalDistanceCost(parcel.getDistance())+sea.additionalWeightCost(parcel.getWeight()));
    }

}

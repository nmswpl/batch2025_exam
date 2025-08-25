package in.co.nmsworks.test;

public class LandShipping implements ShippingMethod
{
    private double basePrice;
    private double baseWeight;
    private double baseDistance;

    public LandShipping(double basePrice, double baseWeight, double baseDistance)
    {
        this.basePrice = basePrice;
        this.baseWeight = baseWeight;
        this.baseDistance = baseDistance;
    }

    @Override
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getBaseWeight() {
        return baseWeight;
    }

    @Override
    public double getBaseDistance() {
        return baseDistance;
    }

    @Override
    public double additionalWeightCost(double weight)
    {
        if (weight <= 5)
        {
            return weight * 10;
        }
        else if (weight > 5 && weight < 15)
        {
            return weight * 15;
        }
        return weight * 20;
    }

    @Override
    public double additionalDistanceCost(double distance)
    {
        if (distance <= 300)
        {
            return distance * 20;
        }
        else if (distance > 300 && distance < 700)
        {
            return distance * 30;
        }
        return distance * 35;
    }
}
